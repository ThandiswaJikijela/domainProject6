package com.thandiswa.service.Impl;

import com.thandiswa.domain.Spa;
import com.thandiswa.repository.Impl.SpaRepositoryImpl;
import com.thandiswa.repository.SpaRepository;
import com.thandiswa.service.SpaService;

import java.util.Set;

public class SpaServiceImpl implements SpaService {
    private static SpaServiceImpl service = null;
    private SpaRepository repository;

    private SpaServiceImpl() {
        this.repository = SpaRepositoryImpl.getRepository();
    }

    public static SpaServiceImpl getService(){
        if (service == null) service = new SpaServiceImpl();
        return service;
    }

    @Override
    public Spa create(Spa spa) {
        return this.repository.create(spa);
    }

    @Override
    public Spa update(Spa spa) {
        return this.repository.update(spa);
    }

    @Override
    public void delete(String s) {
        this.repository.read(s);
    }

    @Override
    public Spa read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Spa> getAll() {
        return this.repository.getAll();
    }

}
