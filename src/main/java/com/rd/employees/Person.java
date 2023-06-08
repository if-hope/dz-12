package com.rd.employees;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isPartner;

    public Person(String firstName, String lastName, int age, boolean isPartner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isPartner = isPartner;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isPartner() {
        return isPartner;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPartner(boolean partner) {
        isPartner = partner;
    }

    public void setAge(int age) {
        if (age >0){
        this.age = age;
        } else {
            System.out.println("The age couldn't be negative or zero");
        }
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract boolean isRetired();
}
