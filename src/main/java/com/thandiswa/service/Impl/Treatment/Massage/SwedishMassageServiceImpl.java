package com.thandiswa.service.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.repository.Impl.Treatment.Massage.SwedishMassageRepositoryImpl;
import com.thandiswa.repository.Treatment.Massage.SwedishMassageRepository;
import com.thandiswa.service.Treatment.Massage.SwedishMassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SwedishMassageServiceImpl implements SwedishMassageService {
    //@Autowired
    @Qualifier("InMemory")
    private static SwedishMassageServiceImpl service = null;
    private SwedishMassageRepository repository;

    private SwedishMassageServiceImpl() {
        this.repository = SwedishMassageRepositoryImpl.getRepository();
    }

    public static SwedishMassageServiceImpl getService(){
        if (service == null) service = new SwedishMassageServiceImpl();
        return service;
    }

    @Override
    public SwedishMassage create(SwedishMassage swedishMassage) {
        return this.repository.create(swedishMassage);
    }

    @Override
    public SwedishMassage update(SwedishMassage swedishMassage) {
        return this.repository.update(swedishMassage);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public SwedishMassage read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<SwedishMassage> getAll() {
        return this.repository.getAll();
    }

}
