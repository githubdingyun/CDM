package com.cdm.controller;

import com.cdm.model.*;
import com.cdm.service.impl.WorkerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/BaseController")
public class BaseController {

    @Autowired
    WorkerServiceImpl workerService;

    @RequestMapping("base.do")
    public String base(HttpServletRequest request, HttpServletResponse response) {
        List<Worker> workers = workerService.selectByExample(new WorkerExample());
        request.setAttribute("workers", workers);
        return "base";
    }


    @RequestMapping("location.do")
    public String location(Location location, HttpServletRequest request, HttpServletResponse response) {

        return "location";

    }

    @RequestMapping("material.do")
    public String material(Material material, HttpServletRequest request, HttpServletResponse response) {

        return "material";

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @RequestMapping("notice.do")
    public String notice(Notice notice, HttpServletRequest request, HttpServletResponse response) {

        return "notice";

    }

    @RequestMapping("projectMaterial.do")
    public String userVerifier(ProjectMaterial projectMaterial, HttpServletRequest request, HttpServletResponse response) {

        return "projectMaterial";

    }

    @RequestMapping("project.do")
    public String userVerifier(Project project, HttpServletRequest request, HttpServletResponse response) {

        return "project";

    }

    @RequestMapping("subject.do")
    public String userVerifier(Subject subject, HttpServletRequest request, HttpServletResponse response) {

        return "subject";

    }

    @RequestMapping("supplier.do")
    public String userVerifier(Supplier supplier, HttpServletRequest request, HttpServletResponse response) {

        return "supplier";

    }

    @RequestMapping("warehouse.do")
    public String userVerifier(Warehouse warehouse, HttpServletRequest request, HttpServletResponse response) {

        return "warehouse";

    }

    @RequestMapping("warehouseMaterial.do")
    public String userVerifier(WarehouseMaterial warehouseMaterial, HttpServletRequest request, HttpServletResponse response) {

        return "warehouseMaterial";

    }

    @RequestMapping("message.do")
    public String userVerifier(Message message, HttpServletRequest request, HttpServletResponse response) {

        return "message";

    }

    @RequestMapping("profile.do")
    public String profile(HttpServletRequest request, HttpServletResponse response) {

        return "profile";

    }

    @RequestMapping("permission.do")
    public String permission(HttpServletRequest request, HttpServletResponse response) {

        return "permission";

    }

    @RequestMapping("mailbox.do")
    public String mailbox(HttpServletRequest request, HttpServletResponse response) {

        return "mailbox";

    }

    @RequestMapping("show.do")
    public String show(HttpServletRequest request, HttpServletResponse response) {

        return "show";

    }



}
