package repository.Impl.Treatment.Massage;

import domain.Treatment.Massage.MassageTreatment;
import repository.Treatment.Massage.MassageTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        massageTreatmentTable.put(treatment.getMassageType(),treatment);
        MassageTreatment savedTreatment = massageTreatmentTable.get(toString());
        return savedTreatment;
    }

    @Override
    public MassageTreatment read(String m) {
        MassageTreatment treatment = massageTreatmentTable.get(toString());
        return treatment;
    }

    @Override
    public MassageTreatment update(MassageTreatment treatment) {
        massageTreatmentTable.put(treatment.toString(),treatment);
        MassageTreatment savedTreatment = massageTreatmentTable.get(toString());
        return savedTreatment;
    }

    @Override
    public void delete(String m) {
        massageTreatmentTable.remove(toString());
    }

    @Override
    public Set<MassageTreatment> getAll() {
        return (Set<MassageTreatment>) massageTreatmentTable;
    }
}
