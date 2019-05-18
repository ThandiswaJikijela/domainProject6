package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.repository.Staff.SpaAdminRepository;

import java.util.*;

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
        this.spaAdminMap.put(spaAdmin.toString(),spaAdmin);
        return this.spaAdminMap.get(spaAdmin.toString());
    }

    @Override
    public SpaAdmin read(String a) {
        SpaAdmin spaAdmin = spaAdminMap.get(toString());
        return spaAdmin;
    }

    @Override
    public SpaAdmin update(SpaAdmin spaAdmin) {
        this.spaAdminMap.replace(spaAdmin.toString(),spaAdmin);
        return this.spaAdminMap.get(spaAdmin.toString());
    }

    @Override
    public void delete(String a) {
        spaAdminMap.remove(toString());
    }

    @Override
    public Set<SpaAdmin> getAll() {
        Collection<SpaAdmin> spaAdmins = this.spaAdminMap.values();
        Set<SpaAdmin> set = new HashSet<>();
        set.addAll(spaAdmins);
        return set;
    }
}
