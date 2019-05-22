package com.thandiswa.service.Impl.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.factory.LogIn.RegisterFactory;
import com.thandiswa.repository.Impl.Login.RegisterRepositoryImpl;
import com.thandiswa.repository.Login.RegisterRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterServiceImplTest {
    private RegisterRepositoryImpl repository;
    private Register register;

    @Before
    public void setUp() throws Exception {
        this.repository = RegisterRepositoryImpl.getRepository();
        this.register = RegisterFactory.getRegister("Diamond","diamond@yahoo.com");
    }

    @Test
    public void create() {
        Register created = this.repository.create(this.register);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.register);
    }

    @Test
    public void update() {
        String newEmail = "Lwethu";
        Register updated = new Register.Builder().email(newEmail).build();
        System.out.println("In update, about_to_updated = " + register.getEmail());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newEmail, updated.getEmail());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(register.getName());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, email = "+ register.getEmail());
        Register read = this.repository.read(register.getEmail());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(register,read);
    }

    @Test
    public void getAll() {
        Set<Register> registers = this.repository.getAll();
        //System.out.println("In getAll, all = " + registers);
    }
}