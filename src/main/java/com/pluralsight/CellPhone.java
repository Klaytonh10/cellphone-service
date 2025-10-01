package com.pluralsight;

public class CellPhone {

    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";

    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // GET/SET
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarrier() {
        return this.carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }


    // dial
    public void dial(CellPhone phoneBeingCalled) {
        System.out.printf("%s's phone is calling %s", this.getOwner(), phoneBeingCalled.getPhoneNumber());
    }
}
