package com.thandiswa.repository.Impl.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.factory.LogIn.LogInFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Login.LoginRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginRepositoryImplTest {
    private LoginRepository repository;
    private LogIn logIn;

    @Before
    public void setUp() throws Exception {
        repository = LoginRepositoryImpl.getRepository();
        this.logIn = LogInFactory.getLogIn("lut#1375","Lutho");
    }

    @Test
    public void create() {
        LogIn created = this.repository.create(this.logIn);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.logIn);
    }

    @Test
    public void read() {
        System.out.println("In read, username = "+ logIn.getUsername());
        LogIn read = this.repository.read(logIn.getUsername());
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(logIn,read);
    }

    @Test
    public void update() {
        String newUserName = "Lizolethu";
        LogIn updated = new LogIn.Builder().username(newUserName).build();
        System.out.println("In update, about_to_updated = " + logIn.getUsername());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newUserName, updated.getUsername());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(logIn.getPassword());
        getAll();
    }

    @Test
    public void getAll() {
        Set<LogIn> logIns = this.repository.getAll();
    }
}