package com.ems.models;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empUserId;

    private String empFirstName;

    private String empLastName;

    private String empEmailId;


    public Employee() {
    }

    public Employee(Long empUserId, String empFirstName, String empLastName, String empEmailId) {
        this.empUserId = empUserId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empEmailId = empEmailId;
    }

    public Long getEmpUserId() {
        return empUserId;
    }

    public void setEmpUserId(Long empUserId) {
        this.empUserId = empUserId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }


}
