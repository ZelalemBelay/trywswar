package com.ftc.cont;

/**
 * Created by Zelalem Belay on 1/21/2017.
 */
public class Person
{
    int id;
    String name;
    Address address;

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


