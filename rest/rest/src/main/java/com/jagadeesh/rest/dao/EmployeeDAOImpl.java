package com.jagadeesh.rest.dao;

import com.jagadeesh.rest.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllEmployees() {
        TypedQuery<Employee> employees = entityManager.createQuery("From Employee", Employee.class);
        List<Employee> employeeList  = employees.getResultList();
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        Employee employee = entityManager.find(Employee.class, employeeId);
        return employee;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = entityManager.merge(employee);
        return savedEmployee;
    }

    @Override
    public Employee updateEmployee(int employeeId, Employee employee) {
        Employee updatedEmployee = entityManager.merge(employee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployeeById(int employeeId, Employee employee) {
        Employee employeeToBeDelete = entityManager.find(Employee.class, employeeId);
        entityManager.remove(employeeToBeDelete);
    }
}
