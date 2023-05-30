package com.rd.employees;

public class Woman extends Person {
    private String oldLastName;

    public Woman(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }

    public void registerPartnership(Man man){
        this.oldLastName = getLastName();
        setLastName(man.getLastName());
    }

    public void deregisterPartnership(){
        if (oldLastName != null) {
            setLastName(oldLastName);
        }
    }
}
