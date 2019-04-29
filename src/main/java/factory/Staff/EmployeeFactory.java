package factory.Staff;

import domain.Staff.Employee;

import java.util.Map;

public class EmployeeFactory {
    public static Employee getEmployee(Map<String, String> values, String username) {
        return new Employee.Builder().username(username)
                .password(values.get("password"))
                .employeeID(values.get("employeeID"))
                .build();
    }
}
