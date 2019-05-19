package com.thandiswa.service.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.repository.Impl.Treatment.Facial.FacialTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Facial.FacialTreatmentRepository;
import com.thandiswa.service.Treatment.Facial.FacialTreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceFacialImpl")
public class FacialTreatmentServiceImpl implements FacialTreatmentService {
    @Autowired
    @Qualifier("InMemory")
    private static FacialTreatmentServiceImpl service = null;
    private FacialTreatmentRepository repository;

    private FacialTreatmentServiceImpl() {
        this.repository = FacialTreatmentRepositoryImpl.getRepository();
    }

    public static FacialTreatmentServiceImpl getService(){
        if (service == null) service = new FacialTreatmentServiceImpl();
        return service;
    }

    @Override
    public FacialTreatment create(FacialTreatment facialTreatment) {
        return this.repository.create(facialTreatment);
    }

    @Override
    public FacialTreatment update(FacialTreatment facialTreatment) {
        return this.repository.update(facialTreatment);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public FacialTreatment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<FacialTreatment> getAll() {
        return this.repository.getAll();
    }
}
