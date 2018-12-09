package com.financialDashboard.services;


import com.financialDashboard.models.Customer;
import com.financialDashboard.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

@Autowired
    CustomerRepository customerRepository;


 public List<Customer> All(){
     List<Customer> customers = customerRepository.findAll();
     return customers;
}

}
