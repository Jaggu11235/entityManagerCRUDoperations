package com.jagadeesh.rest.dao;

import com.jagadeesh.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployeeById(int employeeId, Employee employee);
}
