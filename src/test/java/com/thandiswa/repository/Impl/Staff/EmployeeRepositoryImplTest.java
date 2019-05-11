package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.factory.Staff.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Staff.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {
    private EmployeeRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
        values.put("password","th63543@");
        values.put("employeeID","76476612");
    }

    @Test
    public void create() {
        Employee employee = EmployeeFactory.getEmployee(values,"Garreth");
        repository.create(employee);
        System.out.print(employee);
        assertEquals("Garreth",employee.getUsername());
    }

    @Test
    public void read() {
        Employee readEmployee = repository.read("");
        assertEquals("Garreth",readEmployee.getUsername());
    }

    @Test
    public void update() {
        Employee employee = repository.read("1");
        Employee newEmployee = new Employee.Builder()
                .employeeID(values.get("username"))
                .password(values.get("password"))
                .username("Sadi")
                .build();
        repository.update(newEmployee);
        Employee UpdateEmployee = repository.read("1");
        assertEquals("Sadi",UpdateEmployee.getUsername());
    }

    @Test
    public void delete() {
        repository.delete("1");
        Employee employee = repository.read("1");
        assertNull(employee);
    }

    @Test
    public void getAll() {
        Set<Employee> employee = this.repository.getAll();
        Assert.assertEquals(1,employee.size());
    }
}