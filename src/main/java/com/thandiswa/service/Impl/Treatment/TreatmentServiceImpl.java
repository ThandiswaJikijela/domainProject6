package com.thandiswa.service.Impl.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.repository.Impl.Treatment.TreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.TreatmentRepository;
import com.thandiswa.service.Treatment.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceTreatmentImpl")
public class TreatmentServiceImpl implements TreatmentService {
    @Autowired
    @Qualifier("InMemory")
    private static TreatmentServiceImpl service = null;
    private TreatmentRepository repository;

    private TreatmentServiceImpl() {
        this.repository = TreatmentRepositoryImpl.getRepository();
    }

    public static TreatmentServiceImpl getService(){
        if (service == null) service = new TreatmentServiceImpl();
        return service;
    }

    @Override
    public Treatment create(Treatment treatment) {
        return this.repository.create(treatment);
    }

    @Override
    public Treatment update(Treatment treatment) {
        return this.repository.update(treatment);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Treatment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Treatment> getAll() {
        return this.repository.getAll();
    }
}
