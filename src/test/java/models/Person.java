package models;

import com.opencsv.bean.CsvBindByName;

public class Person {

    @CsvBindByName(column = "firstName")
    private String firstName;
    @CsvBindByName(column = "lastName")
    private String lastName;

    @CsvBindByName(column = "age")
    private int age;

    @CsvBindByName(column = "isPartner")
    private boolean isPartner;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPartner() {
        return isPartner;
    }

    public void setPartner(boolean partner) {
        this.isPartner = partner;
    }
}
