package com.thandiswa.service.Impl;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.repository.CancelationRepository;
import com.thandiswa.repository.Impl.CancelationRepositoryImpl;
import com.thandiswa.service.CancelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceCancellationImpl")
public class CancelationServiceImpl implements CancelationService {
    @Autowired
    @Qualifier("InMemory")
    private static CancelationServiceImpl service = null;
    private CancelationRepository repository;

    private CancelationServiceImpl() {
        this.repository = CancelationRepositoryImpl.getRepository();
    }

    public static CancelationServiceImpl getService(){
        if (service == null) service = new CancelationServiceImpl();
        return service;
    }

    @Override
    public Cancelation create(Cancelation cancelation) {
        return this.repository.create(cancelation);
    }

    @Override
    public Cancelation update(Cancelation cancelation) {
        return this.repository.update(cancelation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }

    @Override
    public Cancelation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Cancelation> getAll() {
        return this.repository.getAll();
    }
}
