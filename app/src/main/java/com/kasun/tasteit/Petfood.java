package com.kasun.tasteit;

public class Petfood {

    private String foodcate;
    private String subcate;
    private String foodPrice;
    private String expDate;
    private String brand;


    public Petfood(){

    }


    public String getFoodcate() {
        return foodcate;
    }

    public void setFoodcate(String foodcate) {
        this.foodcate = foodcate;
    }

    public String getSubcate() {
        return subcate;
    }

    public void setSubcate(String subcate) {
        this.subcate = subcate;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Petfood(String foodcate, String subcate, String foodPrice, String expDate, String brand) {
        this.foodcate = foodcate;
        this.subcate = subcate;
        this.foodPrice = foodPrice;
        this.expDate = expDate;
        this.brand = brand;

    }


}
