package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customers")
@Data
@Getter
@Setter
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String customerName;

    private String nationalId;

    private String address;

    private String phoneNumber;

    private String emailAddress;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateOfBirth; // yyyy-MM-dd

    private String branch;

    private String cardNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date cardIssueDate; // yyyy-MM-dd

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date accountActiveDate; // yyyy-MM-dd

    private String cardStatus;

    private Integer balance;

    private String level;
}
