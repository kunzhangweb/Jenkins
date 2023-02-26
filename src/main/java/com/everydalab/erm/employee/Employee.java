package com.everydalab.erm.employee;

import java.util.UUID;

public class Employee {

    private final UUID employeeId;
    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final String email;
    private final String phoneNo;

    // constructor
    public Employee(UUID employeeId, String firstName, String lastName, Gender gender, String email, String phoneNo) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // getters
    public UUID getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // define Gender
    public enum Gender {
        MALE, FEMALE
    }

}   // end class
