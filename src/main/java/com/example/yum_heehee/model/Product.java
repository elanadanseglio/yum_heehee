package com.example.yum_heehee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @Column(name="PRODUCTID")
    private int PRODUCTID;

    @Column
    private String NAME;

    @Column
    private float PRICE;

    public Product(){

    }

    public Product(int PRODUCTID, String NAME, float PRICE){
        this.PRODUCTID = PRODUCTID;
        this.NAME = NAME;
        this.PRICE = PRICE;
    }

    public int getProductId(){
        return PRODUCTID;
    }

    public void setProductId(int productid){
        this.PRODUCTID = productid;
    }

    public String getName(){
        return NAME;
    }

    public void setName(String name){
        this.NAME = name;
    }

    public float getPrice(){
        return PRICE;
    }

    public void setPrice(float price){
        this.PRICE = price;
    }
}