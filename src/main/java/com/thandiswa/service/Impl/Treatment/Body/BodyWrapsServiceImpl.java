package com.thandiswa.service.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.repository.Impl.Treatment.Body.BodyWrapsRepositoryImpl;
import com.thandiswa.repository.Treatment.Body.BodyWrapsRepository;
import com.thandiswa.service.Treatment.Body.BodyWrapsService;

import java.util.Set;

public class BodyWrapsServiceImpl implements BodyWrapsService {
    private static BodyWrapsServiceImpl service = null;
    private BodyWrapsRepository repository;

    private BodyWrapsServiceImpl() {
        this.repository = BodyWrapsRepositoryImpl.getRepository();
    }

    public static BodyWrapsServiceImpl getService(){
        if (service == null) service = new BodyWrapsServiceImpl();
        return service;
    }

    @Override
    public BodyWraps create(BodyWraps bodyWraps) {
        return this.repository.create(bodyWraps);
    }

    @Override
    public BodyWraps update(BodyWraps bodyWraps) {
        return this.repository.update(bodyWraps);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public BodyWraps read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<BodyWraps> getAll() {
        return this.repository.getAll();
    }

}
