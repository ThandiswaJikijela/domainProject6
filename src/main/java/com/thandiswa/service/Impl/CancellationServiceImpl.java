package com.thandiswa.service.Impl;

import com.thandiswa.domain.Cancellation;
import com.thandiswa.repository.CancellationRepository;
import com.thandiswa.repository.Impl.CancellationRepositoryImpl;
import com.thandiswa.service.CancellationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceCancellationImpl")
public class CancellationServiceImpl implements CancellationService {
    @Autowired
    @Qualifier("InMemory")
    private static CancellationServiceImpl service = null;
    private CancellationRepository repository;

    private CancellationServiceImpl() {
        this.repository = CancellationRepositoryImpl.getRepository();
    }

    public static CancellationServiceImpl getService(){
        if (service == null) service = new CancellationServiceImpl();
        return service;
    }

    @Override
    public Cancellation create(Cancellation cancellation) {
        return this.repository.create(cancellation);
    }

    @Override
    public Cancellation update(Cancellation cancellation) {
        return this.repository.update(cancellation);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }

    @Override
    public Cancellation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Cancellation> getAll() {
        return this.repository.getAll();
    }
}
