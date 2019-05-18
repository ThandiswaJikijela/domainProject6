package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.factory.Staff.SpaAdminFactory;
import com.thandiswa.repository.Staff.SpaAdminRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class SpaAdminRepositoryImplTest {
    private SpaAdminRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = SpaAdminRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        SpaAdmin spaAdmin = SpaAdminFactory.getSpaAdmin("1234#fh");
        repository.create(spaAdmin);
        System.out.print(spaAdmin);
        assertEquals("1234#fh",spaAdmin.getPassword());
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void getAll() {
    }
}