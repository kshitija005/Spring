package com.example.officeManagementApp.Model;

public class Manager {
    private int managerId;
    private String name;
    private int age;
    private int noOfReporters;
    private String department;

    public Manager() {
    }

    public Manager(int managerId, String name, int age, int noOfReporters, String department) {
        this.managerId = managerId;
        this.name = name;
        this.age = age;
        this.noOfReporters = noOfReporters;
        this.department = department;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoOfReporters() {
        return noOfReporters;
    }

    public void setNoOfReporters(int noOfReporters) {
        this.noOfReporters = noOfReporters;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
