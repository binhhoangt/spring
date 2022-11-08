package com.example.demo.controller;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/test")
    public String sayHello(){
        return "hello";
    }

    @GetMapping(value = "/all")
    public List<CustomerEntity> findAllCustomer(){
        return customerService.findAllCustomer();
    }

    @GetMapping(value = "/current" )
    public List<CustomerEntity> findByAccountActiveDate(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
        return customerService.findByAccountActiveDate(date);
    }

    @GetMapping(value = "/condokhingheo")
    public CustomerEntity findSmallestBalance(){
        return customerService.findSmallestBalance();
    }
}
