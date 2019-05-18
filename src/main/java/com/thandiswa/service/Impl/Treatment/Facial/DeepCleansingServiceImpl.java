package com.thandiswa.service.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.repository.Impl.Treatment.Facial.DeepCleansingRepositoryImpl;
import com.thandiswa.repository.Treatment.Facial.DeepCleansingRepository;
import com.thandiswa.service.Treatment.Facial.DeepCleansingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DeepCleansingServiceImpl implements DeepCleansingService {
    //@Autowired
    @Qualifier("InMemory")
    private static DeepCleansingServiceImpl service = null;
    private DeepCleansingRepository repository;

    private DeepCleansingServiceImpl() {
        this.repository = DeepCleansingRepositoryImpl.getRepository();
    }

    public static DeepCleansingServiceImpl getService(){
        if (service == null) service = new DeepCleansingServiceImpl();
        return service;
    }

    @Override
    public DeepCleansing create(DeepCleansing deepCleansing) {
        return this.repository.create(deepCleansing);
    }

    @Override
    public DeepCleansing update(DeepCleansing deepCleansing) {
        return this.repository.update(deepCleansing);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public DeepCleansing read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<DeepCleansing> getAll() {
        return this.repository.getAll();
    }
}
