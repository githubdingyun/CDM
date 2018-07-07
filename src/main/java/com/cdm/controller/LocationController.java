package com.cdm.controller;

import com.cdm.model.Location;
import com.cdm.model.LocationExample;
import com.cdm.service.impl.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/LocationController")
public class LocationController {

    @Autowired
    LocationServiceImpl locationService;




    @RequestMapping("/add.do")
    public String add(Location location,HttpServletRequest request,HttpServletResponse response){
        locationService.insert(location);
        return "redirect:/BaseController/location.do";

    }

    @RequestMapping("/delete.do")
    public String delete(Location location,HttpServletRequest request,HttpServletResponse response){
        locationService.deleteByPrimaryKey(location.getLocationId());
        return "redirect:/BaseController/location.do";


    }

    @RequestMapping("/query.do")
    public String query(Location location,HttpServletRequest request,HttpServletResponse response){
        Location location1 = locationService.selectByPrimaryKey(location.getLocationId());
        request.setAttribute("location1",location1);
        return "redirect:/BaseController/show.do";
    }

    @RequestMapping("/update.do")
    public String update(Location location,HttpServletRequest request,HttpServletResponse response){
        locationService.updateByPrimaryKeySelective(location);
        return "redirect:/BaseController/location.do";
    }





}
