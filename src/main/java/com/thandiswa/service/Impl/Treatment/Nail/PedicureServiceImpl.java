package com.thandiswa.service.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.repository.Impl.Treatment.Nail.PedicureRepositoryImpl;
import com.thandiswa.repository.Treatment.Nail.PedicureRepository;
import com.thandiswa.service.Treatment.Nail.PedicureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServicePedicureImpl")
public class PedicureServiceImpl implements PedicureService {
    @Autowired
    @Qualifier("InMemory")
    private static PedicureServiceImpl service = null;
    private PedicureRepository repository;

    private PedicureServiceImpl() {
        this.repository = PedicureRepositoryImpl.getRepository();
    }

    public static PedicureServiceImpl getService(){
        if (service == null) service = new PedicureServiceImpl();
        return service;
    }

    @Override
    public Pedicure create(Pedicure pedicure) {
        return this.repository.create(pedicure);
    }

    @Override
    public Pedicure update(Pedicure pedicure) {
        return this.repository.update(pedicure);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Pedicure read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Pedicure> getAll() {
        return this.repository.getAll();
    }
}
