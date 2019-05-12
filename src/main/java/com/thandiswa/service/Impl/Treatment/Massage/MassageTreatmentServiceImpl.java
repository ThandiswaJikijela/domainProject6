package com.thandiswa.service.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.repository.Impl.Treatment.Massage.MassageTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Massage.MassageTreatmentRepository;
import com.thandiswa.service.Treatment.Massage.MassageTreatmentService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MassageTreatmentServiceImpl implements MassageTreatmentService {
    private static MassageTreatmentServiceImpl service = null;
    private MassageTreatmentRepository repository;

    private MassageTreatmentServiceImpl() {
        this.repository = MassageTreatmentRepositoryImpl.getRepository();
    }

    public static MassageTreatmentServiceImpl getService(){
        if (service == null) service = new MassageTreatmentServiceImpl();
        return service;
    }

    @Override
    public MassageTreatment create(MassageTreatment massageTreatment) {
        return this.repository.create(massageTreatment);
    }

    @Override
    public MassageTreatment update(MassageTreatment massageTreatment) {
        return this.repository.update(massageTreatment);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public MassageTreatment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<MassageTreatment> getAll() {
        return this.repository.getAll();
    }
}
