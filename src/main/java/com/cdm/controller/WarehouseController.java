package com.cdm.controller;

import com.cdm.model.Warehouse;
import com.cdm.service.impl.WarehouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/WarehouseController")
public class WarehouseController {

    @Autowired
    WarehouseServiceImpl warehouseService;




    @RequestMapping("/add.do")
    public String add(Warehouse warehouse,HttpServletRequest request,HttpServletResponse response){
        warehouseService.insert(warehouse);
        return "redirect:/BaseController/warehouse.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Warehouse warehouse,HttpServletRequest request,HttpServletResponse response){
        warehouseService.deleteByPrimaryKey(warehouse.getWarehouseId());
        return "redirect:/BaseController/warehouse.do";


    }

    @RequestMapping("/query.do")
    public String query(Warehouse warehouse,HttpServletRequest request,HttpServletResponse response){
        Warehouse warehouse1 = warehouseService.selectByPrimaryKey(warehouse.getWarehouseId());
        request.setAttribute("warehouse1",warehouse1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Warehouse warehouse,HttpServletRequest request,HttpServletResponse response){
        warehouseService.updateByPrimaryKeySelective(warehouse);
        return "redirect:/BaseController/warehouse.do";
    }

}
