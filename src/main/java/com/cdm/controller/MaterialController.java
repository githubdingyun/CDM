package com.cdm.controller;

import com.cdm.model.Material;
import com.cdm.service.impl.MaterialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/MaterialController")
public class MaterialController {

    @Autowired
    MaterialServiceImpl materialService;




    @RequestMapping("/add.do")
    public String add(Material material,HttpServletRequest request,HttpServletResponse response){
        materialService.insert(material);
        return "redirect:/BaseController/material.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Material material,HttpServletRequest request,HttpServletResponse response){
        materialService.deleteByPrimaryKey(material.getMaterialId());
        return "redirect:/BaseController/material.do";


    }

    @RequestMapping("/query.do")
    public String query(Material material,HttpServletRequest request,HttpServletResponse response){
        Material material1 = materialService.selectByPrimaryKey(material.getMaterialId());
        request.setAttribute("material1",material1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Material material,HttpServletRequest request,HttpServletResponse response){
        materialService.updateByPrimaryKeySelective(material);
        return "redirect:/BaseController/material.do";
    }

}
