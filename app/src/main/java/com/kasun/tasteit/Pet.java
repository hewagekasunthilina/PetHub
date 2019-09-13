package com.kasun.tasteit;

public class Pet {

    private String FamilyName;
    private String Model;
    private String Age;
    private String NickName;
    private String DOB;
    private String Breed;
    private String Gender;

    public Pet(){

    }

    public Pet(String familyName, String model, String age, String nickName, String DOB, String breed, String gender) {
        FamilyName = familyName;
        Model = model;
        Age = age;
        NickName = nickName;
        this.DOB = DOB;
        Breed = breed;
        Gender = gender;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
