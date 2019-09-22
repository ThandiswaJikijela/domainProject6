package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.repository.Staff.SpaAdminRepository;

import java.util.*;

public class SpaAdminRepositoryImpl implements SpaAdminRepository {

    private static SpaAdminRepository spaAdminRepository;

    private Set<SpaAdmin> spaAdmins;

    private SpaAdminRepositoryImpl() {
        this.spaAdmins = new HashSet<>();
    }

    public static SpaAdminRepository getSpaAdminRepository (){
        if (spaAdminRepository == null) spaAdminRepository = new SpaAdminRepositoryImpl();
        return spaAdminRepository;
    }

    @Override
    public SpaAdmin create(SpaAdmin spaAdmin) {
        this.spaAdmins.add(spaAdmin);
        return spaAdmin;
    }

    @Override
    public SpaAdmin read(String s) {
        return this.spaAdmins.stream()
                .filter(spaAdmin -> spaAdmin.getAdminID().equalsIgnoreCase(s))
                .findAny()
                .orElse(null);
    }

    @Override
    public SpaAdmin update(SpaAdmin spaAdmin) {
        SpaAdmin spaAdmin1 = read(spaAdmin.getPassword());
        if (spaAdmin1 != null) {
            delete(spaAdmin1.getPassword());
            return create(spaAdmin);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        SpaAdmin spaAdmin = read(s);
        this.spaAdmins.remove(spaAdmin);
    }

    @Override
    public SpaAdmin retrieveByDesc(String password) {
        return this.spaAdmins.stream()
                .filter(spaAdmin -> spaAdmin.getPassword().equalsIgnoreCase(password))
                .findAny().orElse(null);
    }

    @Override
    public Set<SpaAdmin> getAll() {
        return this.spaAdmins;
    }
}
