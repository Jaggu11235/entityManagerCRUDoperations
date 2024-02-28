package com.jagadeesh.rest.service;

import com.jagadeesh.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployeeById(int employeeId, Employee employee);
}
