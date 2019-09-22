package com.thandiswa.service.Impl.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.repository.Impl.Staff.SpaAdminRepositoryImpl;
import com.thandiswa.repository.Staff.SpaAdminRepository;
import com.thandiswa.service.Staff.SpaAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpaAdminServiceImpl implements SpaAdminService {

    private static SpaAdminServiceImpl service = null;
    private SpaAdminRepository repository;

    private SpaAdminServiceImpl()
    {

        this.repository = SpaAdminRepositoryImpl.getSpaAdminRepository();
    }

    public static SpaAdminServiceImpl getService(){
        if (service == null) service = new SpaAdminServiceImpl();
        return service;
    }

    @Override
    public SpaAdmin create(SpaAdmin spaAdmin) {
        return this.repository.create(spaAdmin);
    }

    @Override
    public SpaAdmin update(SpaAdmin spaAdmin) {
        return this.repository.update(spaAdmin);
    }

    @Override
    public void delete(String s) {
       this.repository.delete(s);
    }

    @Override
    public SpaAdmin read(String s) {

        return this.repository.read(s);
    }

    @Override
    public SpaAdmin retrieveByDesc(String spaAdminDesc) {

        return this.repository.retrieveByDesc(spaAdminDesc);
    }

    @Override
    public Set<SpaAdmin> getAll() {
        return this.repository.getAll();
    }
}
