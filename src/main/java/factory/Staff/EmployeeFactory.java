package factory.Staff;

import domain.Staff.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String username, String password) {
        return new Employee.Builder().username(username)
                .password(password)
                .build();
    }
}
