package com.thandiswa.service.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.repository.Impl.Treatment.Nail.NailTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Nail.NailTreatmentRepository;
import com.thandiswa.service.Treatment.Nail.NailTreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceNailImpl")
public class NailTreatmentServiceImpl implements NailTreatmentService {
    @Autowired
    @Qualifier("InMemory")
    private static NailTreatmentServiceImpl service = null;
    private NailTreatmentRepository repository;

    private NailTreatmentServiceImpl() {
        this.repository = NailTreatmentRepositoryImpl.getRepository();
    }

    public static NailTreatmentServiceImpl getService(){
        if (service == null) service = new NailTreatmentServiceImpl();
        return service;
    }

    @Override
    public NailTreatment create(NailTreatment nailTreatment) {
        return this.repository.create(nailTreatment);
    }

    @Override
    public NailTreatment update(NailTreatment nailTreatment) {
        return this.repository.update(nailTreatment);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public NailTreatment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<NailTreatment> getAll() {
        return this.repository.getAll();
    }
}
