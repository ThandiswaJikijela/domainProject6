package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.factory.Staff.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Staff.EmployeeRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Garreth","Grarr45#");
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.employee);
    }

    @Test
    public void read() {
        System.out.println("In read, username = "+ employee.getUsername());
        Employee read = this.repository.read(employee.getUsername());
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(employee,read);
    }

    @Test
    public void update() {
        String newUsername = "Harry";
        Employee updated = new Employee.Builder().username(newUsername).build();
        System.out.println("In update, about_to_updated = " + employee.getUsername());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newUsername, updated.getUsername());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getPassword());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Employee> employees = this.repository.getAll();
        //System.out.println("In getAll, all = " + registers);
    }
}