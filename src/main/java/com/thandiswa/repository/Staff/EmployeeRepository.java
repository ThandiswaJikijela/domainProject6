package com.thandiswa.repository.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}
