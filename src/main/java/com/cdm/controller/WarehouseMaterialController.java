package com.cdm.controller;

import com.cdm.dao.WarehouseMaterialMapper;
import com.cdm.model.WarehouseMaterial;
import com.cdm.model.WarehouseMaterialKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/WarehouseMaterialController")
public class WarehouseMaterialController {

    @Autowired
    WarehouseMaterialMapper warehouseMaterialMapper;




    @RequestMapping("/add.do")
    public String add(WarehouseMaterial warehouseMaterial,HttpServletRequest request,HttpServletResponse response){
        warehouseMaterialMapper.insert(warehouseMaterial);
        return "redirect:/BaseController/warehouseMaterial.do";

    }

    @RequestMapping("/delete.do")
    public String delete(WarehouseMaterial warehouseMaterial,HttpServletRequest request,HttpServletResponse response){
        WarehouseMaterialKey warehouseMaterialKey = new WarehouseMaterialKey();
        warehouseMaterialKey.setMaterialId(warehouseMaterial.getMaterialId());
        warehouseMaterialKey.setWarehouseId(warehouseMaterial.getWarehouseId());
        warehouseMaterialMapper.deleteByPrimaryKey(warehouseMaterialKey);
        return "redirect:/BaseController/warehouseMaterial.do";


    }

    @RequestMapping("/query.do")
    public String query(WarehouseMaterial warehouseMaterial,HttpServletRequest request,HttpServletResponse response){
        WarehouseMaterialKey warehouseMaterialKey = new WarehouseMaterialKey();
        warehouseMaterialKey.setMaterialId(warehouseMaterial.getMaterialId());
        warehouseMaterialKey.setWarehouseId(warehouseMaterial.getWarehouseId());
        WarehouseMaterial warehouseMaterial1 = warehouseMaterialMapper.selectByPrimaryKey(warehouseMaterialKey);
        request.setAttribute("warehouseMaterial1",warehouseMaterial1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(WarehouseMaterial warehouseMaterial,HttpServletRequest request,HttpServletResponse response){
        warehouseMaterialMapper.updateByPrimaryKeySelective(warehouseMaterial);
        return "redirect:/BaseController/warehouseMaterial.do";
    }

}
