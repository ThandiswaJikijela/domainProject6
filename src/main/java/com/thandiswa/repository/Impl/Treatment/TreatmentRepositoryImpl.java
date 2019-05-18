package com.thandiswa.repository.Impl.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.repository.Treatment.TreatmentRepository;

import java.util.*;

public class TreatmentRepositoryImpl implements TreatmentRepository {

    private static TreatmentRepositoryImpl repository = null;
    private Map<String, Treatment> treatmentMap;

    private TreatmentRepositoryImpl(){
        this.treatmentMap = new HashMap<String, Treatment>();
    }

    public static TreatmentRepositoryImpl getRepository()
    {
        if (repository == null) repository = new TreatmentRepositoryImpl();
        return repository;
    }

    @Override
    public Treatment create(Treatment treatment) {
        this.treatmentMap.put(treatment.toString(),treatment);
        return treatment;
    }

    @Override
    public Treatment read(String l) {
        Treatment treatment = treatmentMap.get(toString());
        return treatment;
    }

    @Override
    public Treatment update(Treatment treatment) {
        this.treatmentMap.replace(treatment.toString(),treatment);
        return this.treatmentMap.get(treatment.toString());
    }

    @Override
    public void delete(String l) {
        treatmentMap.remove(toString());
    }

    @Override
    public Set<Treatment> getAll() {
        Collection<Treatment> treatments = this.treatmentMap.values();
        Set<Treatment> set = new HashSet<>();
        set.addAll(treatments);
        return set;
    }
}
