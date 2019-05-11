package com.thandiswa.service.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.repository.Impl.Treatment.Nail.ManicureRepositoryImpl;
import com.thandiswa.repository.Treatment.Nail.ManicureRepository;
import com.thandiswa.service.Treatment.Nail.ManicureService;

import java.util.Set;

public class ManicureServiceImpl implements ManicureService {
    private static ManicureServiceImpl service = null;
    private ManicureRepository repository;

    private ManicureServiceImpl() {
        this.repository = ManicureRepositoryImpl.getRepository();
    }

    public static ManicureServiceImpl getService(){
        if (service == null) service = new ManicureServiceImpl();
        return service;
    }

    @Override
    public Manicure create(Manicure manicure) {
        return this.repository.create(manicure);
    }

    @Override
    public Manicure update(Manicure manicure) {
        return this.repository.update(manicure);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Manicure read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Manicure> getAll() {
        return this.repository.getAll();
    }
}
