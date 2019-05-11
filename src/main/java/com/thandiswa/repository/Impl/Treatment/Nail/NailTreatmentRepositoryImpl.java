package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.repository.Treatment.Nail.NailTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NailTreatmentRepositoryImpl implements NailTreatmentRepository {

    private static NailTreatmentRepositoryImpl repository = null;
    private Map<String, NailTreatment> nailTreatmentTable;

    private NailTreatmentRepositoryImpl(){
        this.nailTreatmentTable = new HashMap<String, NailTreatment>();
    }

    public static NailTreatmentRepositoryImpl getRepository()
    {
        if (repository == null) repository = new NailTreatmentRepositoryImpl();
        return repository;
    }

    @Override
    public NailTreatment create(NailTreatment treatment) {
        nailTreatmentTable.put(treatment.getNailType(),treatment);
        nailTreatmentTable.put(treatment.getNailShape(),treatment);
        NailTreatment savedTreatment = nailTreatmentTable.get(toString());
        return savedTreatment;
    }

    @Override
    public NailTreatment read(String n) {
        NailTreatment treatment = nailTreatmentTable.get(toString());
        return treatment;
    }

    @Override
    public NailTreatment update(NailTreatment treatment) {
        nailTreatmentTable.put(treatment.toString(),treatment);
        NailTreatment savedTreatment = nailTreatmentTable.get(toString());
        return savedTreatment;
    }

    @Override
    public void delete(String n) {
        nailTreatmentTable.remove(toString());
    }

    @Override
    public Set<NailTreatment> getAll() {
        return (Set<NailTreatment>) nailTreatmentTable;
    }
}
