package com.example.yum_heehee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerOrder {
    @Id
    @Column(name="CUSTOMER_ORDER", columnDefinition = "VARCHAR(9)")
    private int CUSTOMER_ORDER;

    @Column
    private String PHONENO;

    @Column
    private int EMPLOYEEID;

    public CustomerOrder(){

    }

    public CustomerOrder(int CUSTOMER_ORDER, String PHONENO, int EMPLOYEEID){
        this.CUSTOMER_ORDER = CUSTOMER_ORDER;
        this.PHONENO = PHONENO;
        this.EMPLOYEEID = EMPLOYEEID;
    }

    public int getCustomerOrder(){
        return CUSTOMER_ORDER;
    }

    public void setCustomerOrder(int customerorder){
        this.CUSTOMER_ORDER = customerorder;
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