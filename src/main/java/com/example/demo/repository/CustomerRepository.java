package com.example.demo.repository;

import com.example.demo.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CustomerRepository
        extends JpaRepository<CustomerEntity, Integer> {
    CustomerEntity findTopByOrderByBalanceAsc();
    List<CustomerEntity> findByAccountActiveDate(Date date);
}
