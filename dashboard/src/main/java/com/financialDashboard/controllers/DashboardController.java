package com.financialDashboard.controllers;


import com.financialDashboard.models.Cats;
import com.financialDashboard.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DashboardController {

@Autowired
    DashboardService dashboardService;



@RequestMapping("/heartRate")
public String getHeartBeat(){
    return "72/min";

}
  @RequestMapping("/CatsInfo")
    public Cats getCatsInfo(){

    dashboardService.setCat();
    Cats cats = dashboardService.getCat();
        return cats;

    }

}
