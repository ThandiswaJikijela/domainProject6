package com.thandiswa.service.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.repository.Impl.Treatment.Massage.AromatherapyRepositoryImpl;
import com.thandiswa.repository.Treatment.Massage.AromatherapyRepository;
import com.thandiswa.service.Treatment.Massage.AromatherapyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AromatherapyServiceImpl implements AromatherapyService {
    private static AromatherapyServiceImpl service = null;
    private AromatherapyRepository repository;

    private AromatherapyServiceImpl() {
        this.repository = AromatherapyRepositoryImpl.getRepository();
    }

    public static AromatherapyServiceImpl getService(){
        if (service == null) service = new AromatherapyServiceImpl();
        return service;
    }

    @Override
    public Aromatherapy create(Aromatherapy aromatherapy) {
        return this.repository.create(aromatherapy);
    }

    @Override
    public Aromatherapy update(Aromatherapy aromatherapy) {
        return this.repository.update(aromatherapy);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Aromatherapy read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Aromatherapy> getAll() {
        return this.repository.getAll();
    }
}
