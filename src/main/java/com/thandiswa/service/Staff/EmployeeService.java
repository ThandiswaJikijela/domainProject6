package com.thandiswa.service.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Employee retrieveByDesc(String employeeDesc);
    Set<Employee> getAll();
}
