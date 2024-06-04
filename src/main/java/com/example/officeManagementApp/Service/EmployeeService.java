package com.example.officeManagementApp.Service;

import com.example.officeManagementApp.Model.Employee;
import com.example.officeManagementApp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee)
    {
        //employee.setAge(employee.getAge()+5);
        employeeRepository.addEmployee(employee);
    }


    public Employee getEmployee(int empId)
    {
        return employeeRepository.getEmployee(empId);
    }

    public void deleteEmployee(int empId) {
        employeeRepository.deleteEmployee(empId);
    }

    public Employee updateSalary(int empId, int newSalary)
    {

         return employeeRepository.updateSalary(empId, newSalary);
    }
}