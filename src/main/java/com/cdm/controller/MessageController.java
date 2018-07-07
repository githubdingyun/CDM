package com.cdm.controller;

import com.cdm.model.Message;
import com.cdm.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/MessageController")
public class MessageController {

    @Autowired
    MessageServiceImpl messageService;




    @RequestMapping("/add.do")
    public String add(Message message,HttpServletRequest request,HttpServletResponse response){
        messageService.insert(message);
        return "redirect:/BaseController/message.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Message message,HttpServletRequest request,HttpServletResponse response){
        messageService.deleteByPrimaryKey(message.getMessageId());
        return "redirect:/BaseController/message.do";


    }

    @RequestMapping("/query.do")
    public String query(Message message,HttpServletRequest request,HttpServletResponse response){
        Message message1 = messageService.selectByPrimaryKey(message.getMessageId());
        request.setAttribute("message1",message1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Message message,HttpServletRequest request,HttpServletResponse response){
        messageService.updateByPrimaryKeySelective(message);
        return "redirect:/BaseController/message.do";
    }

}
