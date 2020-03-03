package org.example;

public class Man {
    Human man = new HumanImpl();
    private String gender;

    public Man() {}

    public Man(String type) {
        setGender(type);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
