package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.repository.Staff.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employeeMap;

    private EmployeeRepositoryImpl(){
        this.employeeMap = new HashMap<String, Employee>();
    }

    public static EmployeeRepositoryImpl getRepository()
    {
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
         this.employeeMap.put(employee.toString(),employee);
         return employee;
    }

    @Override
    public Employee read(String e) {
        return this.employeeMap.get(toString());
    }

    @Override
    public Employee update(Employee employee) {
        this.employeeMap.replace(employee.toString(),employee);
        return this.employeeMap.get(employee.toString());
    }

    @Override
    public void delete(String e) {
        employeeMap.remove(toString());
    }

    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employees = this.employeeMap.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }
}
