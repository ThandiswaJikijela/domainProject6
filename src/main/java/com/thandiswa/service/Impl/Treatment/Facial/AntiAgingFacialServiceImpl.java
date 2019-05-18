package com.thandiswa.service.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.repository.Impl.Treatment.Facial.AntiAgingFacialRepositoryImpl;
import com.thandiswa.repository.Treatment.Facial.AntiAgingFacialRepository;
import com.thandiswa.service.Treatment.Facial.AntiAgingFacialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AntiAgingFacialServiceImpl implements AntiAgingFacialService {
    //@Autowired
    @Qualifier("InMemory")
    private static AntiAgingFacialServiceImpl service = null;
    private AntiAgingFacialRepository repository;

    private AntiAgingFacialServiceImpl() {
        this.repository = AntiAgingFacialRepositoryImpl.getRepository();
    }

    public static AntiAgingFacialServiceImpl getService(){
        if (service == null) service = new AntiAgingFacialServiceImpl();
        return service;
    }

    @Override
    public AntAgingFacial create(AntAgingFacial antAgingFacial) {
        return this.repository.create(antAgingFacial);
    }

    @Override
    public AntAgingFacial update(AntAgingFacial antAgingFacial) {
        return this.repository.update(antAgingFacial);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public AntAgingFacial read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<AntAgingFacial> getAll() {
        return this.repository.getAll();
    }
}
