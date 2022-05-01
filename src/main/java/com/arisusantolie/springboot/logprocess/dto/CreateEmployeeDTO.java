package com.arisusantolie.springboot.logprocess.dto;

/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

public class CreateEmployeeDTO {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
