package com.financialDashboard.controllers;


import com.financialDashboard.models.Cats;
import com.financialDashboard.models.Customer;
import com.financialDashboard.services.CustomerService;
import com.financialDashboard.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class DashboardController {

@Autowired
    DashboardService dashboardService;

@Autowired
    CustomerService customerService;

@RequestMapping("/all")
public List<Customer> getAllCustomers(){

    return customerService.All();
}



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
