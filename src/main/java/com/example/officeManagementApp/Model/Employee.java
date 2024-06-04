package com.example.officeManagementApp.Model;

public class Employee {
    private int empID;
    private String name;
    private int age;
    private String dept;
    private int salary;
    private String gender;

    public Employee() {
    }

    public Employee(
            int empID,
            String name,
            int age,
            String dept,
            int salary,
            String gender) {
        this.empID = empID;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
        this.gender = gender;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
