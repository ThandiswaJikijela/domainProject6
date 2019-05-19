package com.thandiswa.service.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.repository.Impl.Treatment.Body.BodyTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Body.BodyTreatmentRepository;
import com.thandiswa.service.Treatment.Body.BodyTreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceBodyTreatmentImpl")
public class BodyTreatmentServiceImpl implements BodyTreatmentService {
    @Autowired
    @Qualifier("InMemory")
    private static BodyTreatmentServiceImpl service = null;
    private BodyTreatmentRepository repository;

    private BodyTreatmentServiceImpl() {
        this.repository = BodyTreatmentRepositoryImpl.getRepository();
    }

    public static BodyTreatmentServiceImpl getService(){
        if (service == null) service = new BodyTreatmentServiceImpl();
        return service;
    }

    @Override
    public BodyTreatment create(BodyTreatment bodyTreatment) {
        return this.repository.create(bodyTreatment);
    }

    @Override
    public BodyTreatment update(BodyTreatment bodyTreatment) {
        return this.repository.update(bodyTreatment);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public BodyTreatment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<BodyTreatment> getAll() {
        return this.repository.getAll();
    }
}
