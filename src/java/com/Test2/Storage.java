/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Test2;

/**
 *
 * @author User
 */
public class Storage {
    int ID;
    String FirstName;
    String FatherName;
    String LastName;
    String BirthDate;
    String Birthplace;
    String Gender;
    String MaritalStatus;
    String PhoneNumber;
    String Address;
    String Email;
    String CF;

    
    public int getID() {
        return ID;
    }
    public int setID(int ID){
        this.ID=ID; 
        return ID;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String setFirstName(String FirstName){
        this.FirstName=FirstName; 
        return FirstName;
    }
    public String getFatherName() {
        return FatherName;
    }
    public String setFatherName(String FatherName){
        this.FatherName=FatherName; 
        return FatherName;
    }
    public String getLastName() {
        return LastName;
    }
    public String setLastName(String LastName){
        this.LastName=LastName; 
        return LastName;
    }
    public String getBirthDate() {
        return BirthDate;
    }
    public String setBirthDate(String BirthDate){
        this.BirthDate=BirthDate; 
        return BirthDate;
    }
    public String getBirthplace() {
        return Birthplace;
    }
    public String setBirthplace(String Birthplace){
        this.Birthplace=Birthplace; 
        return Birthplace;
    }
    public String getGender() {
        return Gender;
    }
    public String setGender(String Gender){
        this.Gender=Gender; 
        return Gender;
    }
    public String getMaritalStatus() {
        return MaritalStatus;
    }
    public String setMaritalStatus(String MaritalStatus){
        this.MaritalStatus=MaritalStatus; 
        return MaritalStatus;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String setPhoneNumber(String PhoneNumber){
        this.PhoneNumber=PhoneNumber; 
        return PhoneNumber;
    }
    public String getAddress() {
        return Address;
    }
    public String setAddress(String Address){
        this.Address=Address; 
        return Address;
    }
    public String getEmail() {
        return Email;
    }
    public String setEmail(String Email){
        this.Email=Email; 
        return Email;
    }
    public String getCF() {
        return CF;
    }
    public String setCF(String CF){
        this.CF=CF; 
        return CF;
    }
    public String toString(){
        return "Storage [ID="+ ID +", FirstName="+ FirstName +",FatherName="+ FatherName +", LastName="+ LastName +",BirthDate="+ BirthDate +",Birthplace="+ Birthplace +", Gender="+ Gender +", MaritalStatus="+ MaritalStatus +", PhoneNumber="+ PhoneNumber +", Address="+ Address +", Email="+ Email +", CF="+ CF +"]";
    }
}
