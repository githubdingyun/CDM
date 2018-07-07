package com.cdm.controller;

import com.cdm.dao.ProjectMaterialMapper;
import com.cdm.model.ProjectMaterial;
import com.cdm.model.ProjectMaterialKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/ProjectMaterialController")
public class ProjectMaterialController {

    @Autowired
    ProjectMaterialMapper projectMaterialMapper;




    @RequestMapping("/add.do")
    public String add(ProjectMaterial projectMaterial,HttpServletRequest request,HttpServletResponse response){
        projectMaterialMapper.insert(projectMaterial);
        return "redirect:/BaseController/projectMaterial.do";

    }

    @RequestMapping("/delete.do")
    public String delete(ProjectMaterial projectMaterial,HttpServletRequest request,HttpServletResponse response){
        ProjectMaterialKey projectMaterialKey = new ProjectMaterialKey();
        projectMaterialKey.setMaterialId(projectMaterial.getMaterialId());
        projectMaterialKey.setProjectId(projectMaterial.getProjectId());
        projectMaterialMapper.deleteByPrimaryKey(projectMaterialKey);
        return "redirect:/BaseController/projectMaterial.do";


    }

    @RequestMapping("/query.do")
    public String query(ProjectMaterial projectMaterial,HttpServletRequest request,HttpServletResponse response){
        ProjectMaterialKey projectMaterialKey = new ProjectMaterialKey();
        projectMaterialKey.setMaterialId(projectMaterial.getMaterialId());
        projectMaterialKey.setProjectId(projectMaterial.getProjectId());
        ProjectMaterial projectMaterial1 = projectMaterialMapper.selectByPrimaryKey(projectMaterialKey);
        request.setAttribute("projectMaterial1",projectMaterial1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(ProjectMaterial projectMaterial,HttpServletRequest request,HttpServletResponse response){
        projectMaterialMapper.updateByPrimaryKeySelective(projectMaterial);
        return "redirect:/BaseController/projectMaterial.do";
    }

}
