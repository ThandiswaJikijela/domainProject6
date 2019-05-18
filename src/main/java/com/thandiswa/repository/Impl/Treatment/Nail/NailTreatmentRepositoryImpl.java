package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.repository.Treatment.Nail.NailTreatmentRepository;

import java.util.*;

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
        this.nailTreatmentTable.put(treatment.toString(),treatment);
        return treatment;
    }

    @Override
    public NailTreatment read(String n) {
        NailTreatment treatment = nailTreatmentTable.get(toString());
        return treatment;
    }

    @Override
    public NailTreatment update(NailTreatment treatment) {
       this.nailTreatmentTable.replace(treatment.toString(),treatment);
       return this.nailTreatmentTable.get(treatment.toString());
    }

    @Override
    public void delete(String n) {
        nailTreatmentTable.remove(toString());
    }

    @Override
    public Set<NailTreatment> getAll() {
        Collection<NailTreatment> nailTreatments = this.nailTreatmentTable.values();
        Set<NailTreatment> set = new HashSet<>();
        set.addAll(nailTreatments);
        return set;
    }
}
