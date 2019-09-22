package com.thandiswa.service.Impl.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.factory.Staff.EmployeeFactory;
import com.thandiswa.repository.Impl.Staff.EmployeeRepositoryImpl;
import com.thandiswa.repository.Staff.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getEmployeeRepository();
        this.employee = EmployeeFactory.getEmployee("Grace","grace247#");
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.employee);
    }

    @Test
    public void update() {
        String newPassword = "Sally#875";
        Employee updated = new Employee.Builder().password(newPassword).build();
        System.out.println("In update, about_to_updated = " + employee.getPassword());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newPassword, updated.getPassword());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getUsername());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, password= "+ employee.getPassword());
        Employee read = this.repository.read(employee.getPassword());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(employee,read);
    }

    @Test
    public void getAll() {
        Set<Employee> employees = this.repository.getAll();
        //System.out.println("In getAll, all = " + registers);
    }
}