package com.cdm.controller;

import com.cdm.model.Notice;
import com.cdm.service.impl.NoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/NoticeController")
public class NoticeController {

    @Autowired
    NoticeServiceImpl noticeService;




    @RequestMapping("/add.do")
    public String add(Notice notice,HttpServletRequest request,HttpServletResponse response){
        noticeService.insert(notice);
        return "redirect:/BaseController/notice.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Notice notice,HttpServletRequest request,HttpServletResponse response){
        noticeService.deleteByPrimaryKey(notice.getNoticeId());
        return "redirect:/BaseController/notice.do";


    }

    @RequestMapping("/query.do")
    public String query(Notice notice,HttpServletRequest request,HttpServletResponse response){
        Notice notice1 = noticeService.selectByPrimaryKey(notice.getNoticeId());
        request.setAttribute("notice1",notice1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Notice notice,HttpServletRequest request,HttpServletResponse response){
        noticeService.updateByPrimaryKeySelective(notice);
        return "redirect:/BaseController/notice.do";
    }

}
