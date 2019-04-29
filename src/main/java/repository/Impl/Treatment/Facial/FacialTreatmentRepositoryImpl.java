package repository.Impl.Treatment.Facial;

import domain.Treatment.Facial.FacialTreatment;
import repository.Treatment.Facial.FacialTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        facialTreatmentMap.put(treatment.getSkinCareProducts(),treatment);
        FacialTreatment savedTreatment = facialTreatmentMap.get(toString());
        return savedTreatment;
    }

    @Override
    public FacialTreatment read(String f) {
        FacialTreatment treatment = facialTreatmentMap.get(toString());
        return treatment;
    }

    @Override
    public FacialTreatment update(FacialTreatment treatment) {
        facialTreatmentMap.put(treatment.toString(),treatment);
        FacialTreatment savedTreatment = facialTreatmentMap.get(toString());
        return savedTreatment;
    }

    @Override
    public void delete(String f) {
        facialTreatmentMap.remove(toString());
    }

    @Override
    public Set<FacialTreatment> getAll() {
        return (Set<FacialTreatment>) facialTreatmentMap;
    }
}
