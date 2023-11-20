package com.example.yum_heehee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column(name="EMPLOYEEID", columnDefinition = "VARCHAR(9)")
    private int EMPLOYEEID;

    @Column
    private String NAME;

    @Column
    private String ACTIVESTATUS;

    public Employee(){

    }

    public Employee(int EMPLOYEEID, String NAME, String ACTIVESTATUS){
        this.EMPLOYEEID = EMPLOYEEID;
        this.NAME = NAME;
        this.ACTIVESTATUS = ACTIVESTATUS;
    }

    public int getEmployeeId(){
        return EMPLOYEEID;
    }

    public void setEmployeeID(int employeeid){
        this.EMPLOYEEID = employeeid;
    }

    public String getName(){
        return NAME;
    }

    public void setName(String name){
        this.NAME = name;
    }

    public String getActiveStatus(){
        return ACTIVESTATUS;
    }

    public void setActiveStatus(String activestatus){
        this.ACTIVESTATUS = activestatus;
    }
}