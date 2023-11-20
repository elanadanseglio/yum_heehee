package com.example.yum_heehee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderList {
    @Id
    @Column(name="ORDER_INDEX")
    private int ORDER_INDEX;

    @Column
    private int ORDER_NUMBER;

    @Column
    private int PRODUCTID;

    @Column
    private int QUANTITY;

    public OrderList(){

    }

    public OrderList(int ORDER_INDEX, int ORDER_NUMBER, int PRODUCTID, int QUANTITY){
        this.ORDER_INDEX = ORDER_INDEX;
        this.ORDER_NUMBER = ORDER_NUMBER;
        this.PRODUCTID = PRODUCTID;
        this.QUANTITY = QUANTITY;
    }

    public int getOrderIndex(){
        return ORDER_INDEX;    
    }

    public void setOrderIndex(int orderindex){
        this.ORDER_INDEX = orderindex;
    }

    public int getOrderNumber(){
        return ORDER_NUMBER;
    }
    
    public void setOrderNumber(int ordernumber){
        this.ORDER_NUMBER = ordernumber;
    }

    public int getProductId(){
        return PRODUCTID;
    }

    public void setProductID(int productid){
        this.PRODUCTID = productid;
    }

    public int getQuantity(){
        return QUANTITY;
    }
    
    public void setQuantity(int quantity){
        this.QUANTITY = quantity;
    }

}