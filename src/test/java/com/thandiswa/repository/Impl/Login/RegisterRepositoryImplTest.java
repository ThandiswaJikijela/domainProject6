package com.thandiswa.repository.Impl.Login;


import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.factory.LogIn.RegisterFactory;
import com.thandiswa.repository.Login.RegisterRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterRepositoryImplTest {
    private RegisterRepository repository;
    private Register register;

    @Before
    public void setUp() throws Exception {
        this.repository = RegisterRepositoryImpl.getRepository();
        this.register = RegisterFactory.getRegister("Sinawo","sina@gmail.com");
    }

    @Test
    public void create() {
        Register created = this.repository.create(this.register);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.register);
    }

    @Test
    public void read() {
        System.out.println("In read, name = "+ register.getName());
        Register read = this.repository.read(register.getName());
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(register,read);
    }

    @Test
    public void update() {
        String newName = "Lwethu";
        Register updated = new Register.Builder().name(newName).build();
        System.out.println("In update, about_to_updated = " + register.getName());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getName());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(register.getEmail());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Register> registers = this.repository.getAll();
        //System.out.println("In getAll, all = " + registers);
    }
}