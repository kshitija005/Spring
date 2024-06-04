package com.example.officeManagementApp.Repository;

import com.example.officeManagementApp.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {

    Map<Integer, Employee> empDb = new HashMap<>();

    public void addEmployee(Employee employee)
    {
        empDb.put(employee.getEmpID(), employee);
    }

    public Employee getEmployee(int empId) {
        return empDb.get(empId);
    }

    public void deleteEmployee(int empId)
    {
        empDb.remove(empId);
    }

    public Employee updateSalary(int empId, int newSalary)
    {
        Employee employee = empDb.get(empId);
        employee.setSalary(newSalary);
        return employee;
    }
}
