package com.thandiswa.repository.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.repository.Treatment.Body.BodyTreatmentRepository;

import java.util.*;

public class BodyTreatmentRepositoryImpl implements BodyTreatmentRepository {

    private static BodyTreatmentRepositoryImpl repository = null;
    private Map<String, BodyTreatment> bodyTreatmentMap;

    private BodyTreatmentRepositoryImpl(){
        this.bodyTreatmentMap = new HashMap<String, BodyTreatment>();
    }

    public static BodyTreatmentRepositoryImpl getRepository()
    {
        if (repository == null) repository = new BodyTreatmentRepositoryImpl();
        return repository;
    }

    @Override
    public BodyTreatment create(BodyTreatment treatment) {
        this.bodyTreatmentMap.put(treatment.toString(),treatment);
        return treatment;
    }

    @Override
    public BodyTreatment read(String b) {
        BodyTreatment treatment = bodyTreatmentMap.get(toString());
        return treatment;
    }

    @Override
    public BodyTreatment update(BodyTreatment treatment) {
        this.bodyTreatmentMap.replace(treatment.toString(),treatment);
        return this.bodyTreatmentMap.get(treatment.toString());
    }

    @Override
    public void delete(String b) {
        bodyTreatmentMap.remove(toString());
    }

    @Override
    public Set<BodyTreatment> getAll() {
        Collection<BodyTreatment> bodyTreatments = this.bodyTreatmentMap.values();
        Set<BodyTreatment> set = new HashSet<>();
        set.addAll(bodyTreatments);
        return set;
    }
}
