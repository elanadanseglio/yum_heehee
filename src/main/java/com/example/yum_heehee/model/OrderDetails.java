package com.example.yum_heehee.model;
import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderDetails {
    @Id
    @Column(name="ORDER_NUMBER", columnDefinition = "VARCHAR(9)")
    private int ORDER_NUMBER;

    @Column
    private int CUSTOMER_ORDER;

    @Column
    private float TOTALPRICE;

    
    public Date getTime() {
        return TIME;
    }

    public void setTime(Date TIME) {
        this.TIME = TIME;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME", columnDefinition = "TIMESTAMP")
    private Date TIME;

    public OrderDetails(){

    }

    public OrderDetails(int ORDER_NUMBER, int CUSTOMER_ORDER, float TOTALPRICE, Date TIME){
        this.ORDER_NUMBER = ORDER_NUMBER;
        this.CUSTOMER_ORDER = CUSTOMER_ORDER;
        this.TOTALPRICE = TOTALPRICE;
        this.TIME = TIME;
    }

    public int getOrderNumber(){ 
        return ORDER_NUMBER;
    }

    public void setOrderNumber(int ordernumber){
        this.ORDER_NUMBER = ordernumber;
    }

    public int getCustomerOrder(){
        return CUSTOMER_ORDER;
    }

    public void setCustomerOrder(int customer_order){
        this.CUSTOMER_ORDER = customer_order;
    }


    public float getTotalPrice(){
        return TOTALPRICE;
    }

    public void setTotalPrice(float totalprice){
        this.TOTALPRICE = totalprice;
    }
}