package com.thandiswa.service.Impl.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.factory.LogIn.LogInFactory;
import com.thandiswa.repository.Impl.Login.LoginRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginServiceImplTest {
    private LoginRepositoryImpl repository;
    private LogIn logIn;

    @Before
    public void setUp() throws Exception {
        this.repository = LoginRepositoryImpl.getRepository();
        this.logIn = LogInFactory.getLogIn("sit#858","Sitshu");
    }

    @Test
    public void create() {
        LogIn created = this.repository.create(this.logIn);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.logIn);
    }

    @Test
    public void update() {
        String newPassword= "Kid448@77";
        LogIn updated = new LogIn.Builder().password(newPassword).build();
        System.out.println("In update, about_to_updated = " + logIn.getPassword());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newPassword, updated.getPassword());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(logIn.getStaffID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, password = "+ logIn.getPassword());
        LogIn read = this.repository.read(logIn.getPassword());
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(logIn,read);
    }

    @Test
    public void getAll() {
        Set<LogIn> logIns = this.repository.getAll();
        //System.out.println("In getAll, all = " + logIns);
    }
}