package com.example.yum_heehee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerOrder {
    @Id
    @Column(name="CUSTOMERORDER", columnDefinition = "VARCHAR(9)")
    private int CUSTOMERORDER;

    @Column
    private String PHONENO;

    @Column
    private int EMPLOYEEID;

    public CustomerOrder(){

    }

    public CustomerOrder(int CUSTOMERORDER, String PHONENO, int EMPLOYEEID){
        this.CUSTOMERORDER = CUSTOMERORDER;
        this.PHONENO = PHONENO;
        this.EMPLOYEEID = EMPLOYEEID;
    }

    public int getCustomerOrder(){
        return CUSTOMERORDER;
    }

    public void setCustomerOrder(int customerorder){
        this.CUSTOMERORDER = customerorder;
    }

    public String getPhoneNo(){
        return PHONENO;
    }

    public void setPhoneNo(String phoneno){
        this.PHONENO = phoneno;
    }

    public int getEmployeeId(){
        return EMPLOYEEID;
    }

    public void setEmployeeId(int employeeid){
        this.EMPLOYEEID = employeeid;
    }
}