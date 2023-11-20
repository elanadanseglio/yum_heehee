package com.example.yum_heehee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @Column(name="PHONENO", columnDefinition = "VARCHAR(10)")
    private String PHONENO;
    
    @Column
    private String NAME;
    
    @Column
    private String ADDRESS;
    
    @Column(nullable=false)
    private int ZIPCODE;

    public Customer(){

    }

    public Customer(String PHONENO, String NAME, String ADDRESS, int ZIPCODE){
        this.PHONENO = PHONENO;
        this.NAME = NAME;
        this.ADDRESS = ADDRESS;
        this.ZIPCODE = ZIPCODE;
    }

    public String getPhoneNo(){
        return PHONENO;
    }

    public void setPhoneNo(String phonenumber){
        this.PHONENO = phonenumber;
    }

    public String getName(){
        return NAME;
    }

    public void setName(String name){
        this.NAME = name;
    }

    public String getAddress(){
        return ADDRESS;
    }

    public void setAddress(String address){
        this.ADDRESS = address;
    }

    public int getZipCode(){
        return ZIPCODE;
    }

    public void setZipCode(int zip){
        this.ZIPCODE = zip;
    }
    
}
