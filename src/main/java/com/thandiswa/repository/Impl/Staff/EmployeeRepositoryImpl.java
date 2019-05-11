package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.repository.Staff.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
         employeeMap.put(employee.getEmployeeID(),employee);
         employeeMap.put(employee.getUsername(),employee);
         employeeMap.put(employee.getPassword(),employee);
         Employee savedEmployee = employeeMap.get(toString());
        return savedEmployee;
    }

    @Override
    public Employee read(String e) {
        Employee employee = employeeMap.get(toString());
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        employeeMap.put(employee.toString(),employee);
        Employee savedEmployee = employeeMap.get(toString());
        return savedEmployee;
    }

    @Override
    public void delete(String e) {
        employeeMap.remove(toString());
    }

    @Override
    public Set<Employee> getAll() {
        return (Set<Employee>) employeeMap;
    }
}
