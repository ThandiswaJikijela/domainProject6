package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.repository.Staff.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepository employeeRepository;

    private Set<Employee> employees;

    private EmployeeRepositoryImpl() {
        this.employees = new HashSet<>();
    }

    public static EmployeeRepository  getEmployeeRepository(){
        if (employeeRepository == null) employeeRepository = new EmployeeRepositoryImpl();
        return employeeRepository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee read(String s) {
        return this.employees.stream()
                .filter(employee -> employee.getUsername().equalsIgnoreCase(s))
                .findAny()
                .orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        Employee employee1 = read(employee.getPassword());
        if (employee1 != null) {
            delete(employee1.getPassword());
            return create(employee);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Employee employee = read(s);
        this.employees.remove(employee);
    }

    @Override
    public Employee retrieveByDesc(String password) {
        return this.employees.stream()
                .filter(spaAdmin -> spaAdmin.getPassword().equalsIgnoreCase(password))
                .findAny().orElse(null);
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }
}
