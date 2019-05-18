package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.repository.Treatment.Massage.MassageTreatmentRepository;

import java.util.*;

public class MassageTreatmentRepositoryImpl implements MassageTreatmentRepository {

    private static MassageTreatmentRepositoryImpl repository = null;
    private Map<String, MassageTreatment> massageTreatmentTable;

    private MassageTreatmentRepositoryImpl(){
        this.massageTreatmentTable = new HashMap<String, MassageTreatment>();
    }

    public static MassageTreatmentRepositoryImpl getRepository()
    {
        if (repository == null) repository = new MassageTreatmentRepositoryImpl();
        return repository;
    }

    @Override
    public MassageTreatment create(MassageTreatment treatment) {
        this.massageTreatmentTable.put(treatment.toString(),treatment);
        return treatment;
    }

    @Override
    public MassageTreatment read(String m) {
        MassageTreatment treatment = massageTreatmentTable.get(toString());
        return treatment;
    }

    @Override
    public MassageTreatment update(MassageTreatment treatment) {
        this.massageTreatmentTable.replace(treatment.toString(),treatment);
        return this.massageTreatmentTable.get(treatment.toString());
    }

    @Override
    public void delete(String m) {
        massageTreatmentTable.remove(toString());
    }

    @Override
    public Set<MassageTreatment> getAll() {
        Collection<MassageTreatment> massageTreatments = this.massageTreatmentTable.values();
        Set<MassageTreatment> set = new HashSet<>();
        set.addAll(massageTreatments);
        return set;
    }
}
