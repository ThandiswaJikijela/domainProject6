package com.thandiswa.repository.Impl.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.factory.LogIn.LogInFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Login.LoginRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class LoginRepositoryImplTest {
    private LoginRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = LoginRepositoryImpl.getRepository();
    }

    @Test
    public void create() {

        LogIn logIn = LogInFactory.getLogIn("mySis6548","Lwabo");
        repository.create(logIn);
        System.out.print(logIn);
        Assert.assertNotNull(logIn);
    }

    @Test
    public void read() {
        LogIn readLogin = repository.read("");
        assertEquals("Siphiwe",readLogin.getUsername());
    }

    @Test
    public void update() {
        /*LogIn logIn = repository.read("1");
        LogIn newLogin = new LogIn.Builder()
                .password(values.get("password"))
                .username("Sinawo")
                .build();
        repository.update(newLogin);
        LogIn UpdateLogin = repository.read("1");
        assertEquals("Sinawo",UpdateLogin.getUsername());

         */
    }

    @Test
    public void delete() {
        repository.delete("1");
        LogIn logIn = repository.read("");
        assertNull(logIn);
    }

    @Test
    public void getAll() {
        Set<LogIn> bookings = this.repository.getAll();
        Assert.assertEquals(1,bookings.size());
    }
}