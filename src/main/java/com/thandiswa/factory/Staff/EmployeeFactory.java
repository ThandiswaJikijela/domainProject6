package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.util.IDs;


public class EmployeeFactory {
    public static Employee getEmployee(String username, String password) {
        return new Employee.Builder().username(username)
                .password(password)
                .employeeID(IDs.generateId())
                .build();
    }
}
