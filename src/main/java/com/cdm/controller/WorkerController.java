package com.cdm.controller;

import com.cdm.model.Worker;
import com.cdm.model.WorkerExample;
import com.cdm.service.impl.WorkerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/WorkerController")
public class WorkerController {

    @Autowired
    WorkerServiceImpl workerService;

    @RequestMapping("/userVerifier.do")
    public String userVerifier(Worker wk, HttpServletRequest request, HttpServletResponse response) {
        WorkerExample workerExample = new WorkerExample();
        WorkerExample.Criteria criteria = workerExample.createCriteria();
        criteria.andWorkerNameEqualTo(wk.getWorkerName());
        criteria.andWorkerPasswordEqualTo(wk.getWorkerPassword());
        List<Worker> workers = workerService.selectByExample(workerExample);
        if(workers.size()!=0){

            Worker worker = workers.get(0);
            request.getSession().setAttribute("worker",worker);

            return "manager";
        }
        else {
            String message = "登陆失败~~·";
            request.setAttribute("message",message);
            return "../../login";
        }

    }

    @RequestMapping("/userReigster")
    public String userReigster(Worker wk,HttpServletRequest request,HttpServletResponse response){
        workerService.insert(wk);
        String message = "注册成功~~·";
        request.setAttribute("message",message);
        return "../../login";
    }
}
