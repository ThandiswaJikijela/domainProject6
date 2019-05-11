package com.thandiswa.repository.Impl.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.factory.LogIn.RegisterFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Login.RegisterRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class RegisterRepositoryImplTest {
    private RegisterRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = RegisterRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
        values.put("address","Woodstock");
        values.put("email ","toshi@gmail.com");
        values.put("username","toshi");
        values.put("password","adimin@1244");
    }

    @Test
    public void create() {
        Register register = RegisterFactory.getRegister(values,"Toshiba");
        repository.create(register);
        System.out.print(register);
        assertEquals("Toshiba",register.getName());
    }

    @Test
    public void read() {
        Register readRegister = repository.read("");
        assertEquals("Toshiba",readRegister.getName());
    }

    @Test
    public void update() {
        Register register = repository.read("1");
        Register newRegister = new Register.Builder()
                .address(values.get("address"))
                .email(values.get("email"))
                .username(values.get("username"))
                .password(values.get("password"))
                .name("Weekend")
                .build();
        repository.update(newRegister);
        Register UpdateRegister = repository.read("1");
        assertEquals("Weekend",UpdateRegister.getName());
    }

    @Test
    public void delete() {
        repository.delete("1");
        Register register = repository.read("1");
        assertNull(register);
    }

    @Test
    public void getAll() {
        Set<Register> registers = this.repository.getAll();
        Assert.assertEquals(1,registers.size());
    }
}