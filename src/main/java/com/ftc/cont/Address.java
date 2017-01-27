package com.ftc.cont;

/**
 * Created by Zelalem Belay on 1/21/2017.
 */
public class Address{
    int zip;
    String address;
    String city;
    String State;

    public Address(int zip, String address, String city, String state) {
        this.zip = zip;
        this.address = address;
        this.city = city;
        State = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
