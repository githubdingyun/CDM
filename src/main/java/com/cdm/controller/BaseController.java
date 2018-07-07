package com.cdm.controller;

import com.cdm.dao.ProjectMaterialMapper;
import com.cdm.dao.WarehouseMaterialMapper;
import com.cdm.model.*;
import com.cdm.service.impl.*;
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
    @Autowired
    WarehouseServiceImpl warehouseService;
    @Autowired

    LocationServiceImpl locationService;
    @Autowired

    MaterialServiceImpl materialService;
    @Autowired

    MessageServiceImpl messageService;
    @Autowired

    NoticeServiceImpl noticeService;
    @Autowired

    ProjectServiceImpl projectService;
    @Autowired

    SubjectServiceImpl subjectService;
    @Autowired

    SupplierServiceImpl supplierService;

    @Autowired
    ProjectMaterialMapper projectMaterialMapper;
    @Autowired
    WarehouseMaterialMapper warehouseMaterialMapper;


    @RequestMapping("base.do")
    public String base(HttpServletRequest request, HttpServletResponse response) {
        List<Worker> workers = workerService.selectByExample(new WorkerExample());
        request.setAttribute("workers", workers);
        return "base";
    }

    @RequestMapping("useradd.do")
    public String useradd(HttpServletRequest request, HttpServletResponse response) {
        return "useradd";
    }

    @RequestMapping("location.do")
    public String location(Location location, HttpServletRequest request, HttpServletResponse response) {
        List<Location> locations = locationService.selectByExample(new LocationExample());
        request.setAttribute("locations",locations);
        return "location";

    }

    @RequestMapping("material.do")
    public String material(Material material, HttpServletRequest request, HttpServletResponse response) {

        List<Material> materials = materialService.selectByExample(new MaterialExample());
        request.setAttribute("materials",materials);
        return "material";

    }


    @RequestMapping("notice.do")
    public String notice(Notice notice, HttpServletRequest request, HttpServletResponse response) {

        List<Notice> notices = noticeService.selectByExample(new NoticeExample());
        request.setAttribute("notices",notices);
        return "notice";

    }

    @RequestMapping("projectMaterial.do")
    public String projectMaterial(ProjectMaterial projectMaterial, HttpServletRequest request, HttpServletResponse response) {
        List<ProjectMaterial> projectMaterials = projectMaterialMapper.selectByExample(new ProjectMaterialExample());
        request.setAttribute("projectMaterials",projectMaterials);
        return "projectMaterial";
    }

    @RequestMapping("project.do")
    public String project(Project project, HttpServletRequest request, HttpServletResponse response) {
        List<Project> projects = projectService.selectByExample(new ProjectExample());
        request.setAttribute("projects",projects);
        return "project";

    }

    @RequestMapping("subject.do")
    public String subject(Subject subject, HttpServletRequest request, HttpServletResponse response) {
        List<Subject> subjects = subjectService.selectByExample(new SubjectExample());
        request.setAttribute("subjects",subjects);
        return "subject";

    }

    @RequestMapping("supplier.do")
    public String supplier(Supplier supplier, HttpServletRequest request, HttpServletResponse response) {
        List<Supplier> suppliers = supplierService.selectByExample(new SupplierExample());
        request.setAttribute("suppliers",suppliers);

        return "supplier";

    }

    @RequestMapping("warehouse.do")
    public String warehouse(Warehouse warehouse, HttpServletRequest request, HttpServletResponse response) {
        List<Warehouse> warehouses = warehouseService.selectByExample(new WarehouseExample());
        request.setAttribute("warehouses",warehouses);
        return "warehouse";

    }

    @RequestMapping("warehouseMaterial.do")
    public String warehouseMaterial(WarehouseMaterial warehouseMaterial, HttpServletRequest request, HttpServletResponse response) {
        List<WarehouseMaterial> warehouseMaterials = warehouseMaterialMapper.selectByExample(new WarehouseMaterialExample());
        request.setAttribute("warehouseMaterials",warehouseMaterials);
        return "warehouseMaterial";

    }

    @RequestMapping("message.do")
    public String message(Message message, HttpServletRequest request, HttpServletResponse response) {
        List<Message> messages = messageService.selectByExample(new MessageExample());
        request.setAttribute("messages",messages);
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
