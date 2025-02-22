package com.example.customer.Model;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String dob;

    private String joinDate;
    private String status;
    private int age;

    public Customer(int id, String firstName, String lastName, String dob, String joinDate, String status, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.joinDate = joinDate;
        this.status = status;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getStatus() {
        return status;
    }

    public int getAge() {
        return age;
    }
}
