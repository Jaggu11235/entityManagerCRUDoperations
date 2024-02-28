package com.jagadeesh.rest.service;

import com.jagadeesh.rest.dao.EmployeeDAO;
import com.jagadeesh.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeDAO.getEmployeeById(employeeId);
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee updateEmployee(int employeeId, Employee employee) {
        return employeeDAO.updateEmployee(employeeId, employee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int employeeId, Employee employee) {
        employeeDAO.deleteEmployeeById(employeeId, employee);
    }
}
