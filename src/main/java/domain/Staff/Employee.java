package domain.Staff;

import java.util.Set;

public class Employee extends Staff {
    private String employeeID, username, password;

    protected Employee(){
        super();
    }

    private Employee (Builder builder){
        this.employeeID = builder.employeeID;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{
        private String employeeID, username, password;
        private Set<Staff> staff;

        public Builder employeeID(String employeeID)
        {
            this.employeeID = employeeID;
            return this;
        }

        public Builder username(String username)
        {
            this.username = username;
            return this;
        }

        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
    public String toString(){
        return"Employee{" +
                ",EmployeeID ='" + employeeID + '\'' +
                ", Username ='" + username + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}
