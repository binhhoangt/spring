package com.example.demo.service;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    public List<CustomerEntity> findAllCustomer() {
        return customerRepository.findAll();
    }

    public List<CustomerEntity>  findByAccountActiveDate(Date date) {
        return customerRepository.findByAccountActiveDate(date);
    }

    public CustomerEntity findSmallestBalance() {
        return customerRepository.findTopByOrderByBalanceAsc();
    }
}
