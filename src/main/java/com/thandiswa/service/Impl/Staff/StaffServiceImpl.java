package com.thandiswa.service.Impl.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.repository.Impl.Staff.StaffRepositoryImpl;
import com.thandiswa.repository.Staff.StaffRepository;
import com.thandiswa.service.Staff.StaffService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StaffServiceImpl implements StaffService {
    private static StaffServiceImpl service = null;
    private StaffRepository repository;

    private StaffServiceImpl() {
        this.repository = StaffRepositoryImpl.getRepository();
    }

    public static StaffServiceImpl getService(){
        if (service == null) service = new StaffServiceImpl();
        return service;
    }

    @Override
    public Staff create(Staff staff) {
        return null;
    }

    @Override
    public Staff update(Staff staff) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Staff read(String s) {
        return null;
    }

    @Override
    public Set<Staff> getAll() {
        return null;
    }
}
