package com.cdm.controller;

import com.cdm.model.Project;
import com.cdm.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/ProjectController")
public class ProjectController {

    @Autowired
    ProjectServiceImpl projectService;




    @RequestMapping("/add.do")
    public String add(Project project,HttpServletRequest request,HttpServletResponse response){
        projectService.insert(project);
        return "redirect:/BaseController/project.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Project project,HttpServletRequest request,HttpServletResponse response){
        projectService.deleteByPrimaryKey(project.getProjectId());
        return "redirect:/BaseController/project.do";


    }

    @RequestMapping("/query.do")
    public String query(Project project,HttpServletRequest request,HttpServletResponse response){
        Project project1 = projectService.selectByPrimaryKey(project.getProjectId());
        request.setAttribute("project1",project1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Project project,HttpServletRequest request,HttpServletResponse response){
        projectService.updateByPrimaryKeySelective(project);
        return "redirect:/BaseController/project.do";
    }

}
