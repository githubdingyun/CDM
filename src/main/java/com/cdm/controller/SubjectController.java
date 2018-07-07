package com.cdm.controller;

import com.cdm.model.Subject;
import com.cdm.service.impl.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/SubjectController")
public class SubjectController {

    @Autowired
    SubjectServiceImpl subjectService;




    @RequestMapping("/add.do")
    public String add(Subject subject,HttpServletRequest request,HttpServletResponse response){
        subjectService.insert(subject);
        return "redirect:/BaseController/subject.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Subject subject,HttpServletRequest request,HttpServletResponse response){
        subjectService.deleteByPrimaryKey(subject.getSubjectId());
        return "redirect:/BaseController/subject.do";


    }

    @RequestMapping("/query.do")
    public String query(Subject subject,HttpServletRequest request,HttpServletResponse response){
        Subject subject1 = subjectService.selectByPrimaryKey(subject.getSubjectId());
        request.setAttribute("subject1",subject1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Subject subject,HttpServletRequest request,HttpServletResponse response){
        subjectService.updateByPrimaryKeySelective(subject);
        return "redirect:/BaseController/subject.do";
    }

}
