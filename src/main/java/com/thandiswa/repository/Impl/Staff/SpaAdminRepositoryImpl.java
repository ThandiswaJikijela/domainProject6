package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.repository.Staff.SpaAdminRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpaAdminRepositoryImpl implements SpaAdminRepository {

    private static SpaAdminRepositoryImpl repository = null;
    private Map<String, SpaAdmin> spaAdminMap;

    private SpaAdminRepositoryImpl(){
        this.spaAdminMap = new HashMap<String, SpaAdmin>();
    }

    public static SpaAdminRepositoryImpl getRepository()
    {
        if (repository == null) repository = new SpaAdminRepositoryImpl();
        return repository;
    }

    @Override
    public SpaAdmin create(SpaAdmin spaAdmin) {
        spaAdminMap.put(spaAdmin.getAdminID(),spaAdmin);
        spaAdminMap.put(spaAdmin.getPassword(),spaAdmin);
        SpaAdmin savedSpaAdmin = spaAdminMap.get(toString());
        return savedSpaAdmin;
    }

    @Override
    public SpaAdmin read(String a) {
        SpaAdmin spaAdmin = spaAdminMap.get(toString());
        return spaAdmin;
    }

    @Override
    public SpaAdmin update(SpaAdmin spaAdmin) {
        spaAdminMap.put(spaAdmin.toString(),spaAdmin);
        SpaAdmin savedSpaAdmin = spaAdminMap.get(toString());
        return savedSpaAdmin;
    }

    @Override
    public void delete(String a) {
        spaAdminMap.remove(toString());
    }

    @Override
    public Set<SpaAdmin> getAll() {
        return (Set<SpaAdmin>) spaAdminMap;
    }
}
