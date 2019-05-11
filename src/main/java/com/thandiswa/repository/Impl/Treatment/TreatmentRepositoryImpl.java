package com.thandiswa.repository.Impl.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.repository.Treatment.TreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        treatmentMap.put(treatment.getName(),treatment);
        treatmentMap.put(treatment.getTreatmentID(),treatment);
        treatmentMap.put(treatment.getDescription(),treatment);
        Treatment savedTreatment = treatmentMap.get(toString());
        return savedTreatment;
    }

    @Override
    public Treatment read(String l) {
        Treatment treatment = treatmentMap.get(toString());
        return treatment;
    }

    @Override
    public Treatment update(Treatment treatment) {
        treatmentMap.put(treatment.toString(),treatment);
        Treatment savedTreatment = treatmentMap.get(toString());
        return savedTreatment;
    }

    @Override
    public void delete(String l) {
        treatmentMap.remove(toString());
    }

    @Override
    public Set<Treatment> getAll() {
        return (Set<Treatment>) treatmentMap;
    }
}
