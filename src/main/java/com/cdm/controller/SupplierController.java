package com.cdm.controller;

import com.cdm.model.Supplier;
import com.cdm.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/SupplierController")
public class SupplierController {

    @Autowired
    SupplierServiceImpl supplierService;




    @RequestMapping("/add.do")
    public String add(Supplier supplier,HttpServletRequest request,HttpServletResponse response){
        supplierService.insert(supplier);
        return "redirect:/BaseController/supplier.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Supplier supplier,HttpServletRequest request,HttpServletResponse response){
        supplierService.deleteByPrimaryKey(supplier.getSupplierId());
        return "redirect:/BaseController/supplier.do";


    }

    @RequestMapping("/query.do")
    public String query(Supplier supplier,HttpServletRequest request,HttpServletResponse response){
        Supplier supplier1 = supplierService.selectByPrimaryKey(supplier.getSupplierId());
        request.setAttribute("supplier1",supplier1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Supplier supplier,HttpServletRequest request,HttpServletResponse response){
        supplierService.updateByPrimaryKeySelective(supplier);
        return "redirect:/BaseController/supplier.do";
    }

}
