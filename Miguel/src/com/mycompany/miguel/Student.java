package com.mycompany.miguel;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }

    @Override
    public String toString() {
        String ageCategory = isMinor ? "minor" : "adult";
        return getName() + " - " + age + " - " + ageCategory;
    }
}

