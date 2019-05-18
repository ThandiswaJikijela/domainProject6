package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.repository.Treatment.Facial.FacialTreatmentRepository;

import java.util.*;

public class FacialTreatmentRepositoryImpl implements FacialTreatmentRepository {

    private static FacialTreatmentRepositoryImpl repository = null;
    private Map<String, FacialTreatment> facialTreatmentMap;

    private FacialTreatmentRepositoryImpl(){
        this.facialTreatmentMap = new HashMap<String, FacialTreatment>();
    }

    public static FacialTreatmentRepositoryImpl getRepository()
    {
        if (repository == null) repository = new FacialTreatmentRepositoryImpl();
        return repository;
    }

    @Override
    public FacialTreatment create(FacialTreatment treatment) {
        this.facialTreatmentMap.put(treatment.toString(),treatment);
        return treatment;
    }

    @Override
    public FacialTreatment read(String f) {
        FacialTreatment treatment = facialTreatmentMap.get(toString());
        return treatment;
    }

    @Override
    public FacialTreatment update(FacialTreatment treatment) {
        this.facialTreatmentMap.replace(treatment.toString(),treatment);
        return this.facialTreatmentMap.get(treatment.toString());
    }

    @Override
    public void delete(String f) {
        facialTreatmentMap.remove(toString());
    }

    @Override
    public Set<FacialTreatment> getAll() {
        Collection<FacialTreatment> facialTreatments = this.facialTreatmentMap.values();
        Set<FacialTreatment> set = new HashSet<>();
        set.addAll(facialTreatments);
        return set;
    }
}
