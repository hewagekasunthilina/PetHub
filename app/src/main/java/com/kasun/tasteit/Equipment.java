package com.kasun.tasteit;

public class Equipment {

    private String EquipmentName;
    private String OwnerName;
    private String ContactNumber;
    private double Price;
    private String Date;
    private String Description;

    public Equipment() {
    }

    public Equipment(String equipmentName, String ownerName, String contactNumber, double price, String date, String description) {
        EquipmentName = equipmentName;
        OwnerName = ownerName;
        ContactNumber = contactNumber;
        Price = price;
        Date = date;
        Description = description;
    }

    public String getEquipmentName() {
        return EquipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        EquipmentName = equipmentName;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
