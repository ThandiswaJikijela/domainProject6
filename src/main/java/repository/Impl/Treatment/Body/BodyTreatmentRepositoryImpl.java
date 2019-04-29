package repository.Impl.Treatment.Body;

import domain.Treatment.Body.BodyTreatment;
import repository.Treatment.Body.BodyTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        bodyTreatmentMap.put(treatment.getTreatmentType(),treatment);
        BodyTreatment savedTreatment = bodyTreatmentMap.get(toString());
        return savedTreatment;
    }

    @Override
    public BodyTreatment read(String b) {
        BodyTreatment treatment = bodyTreatmentMap.get(toString());
        return treatment;
    }

    @Override
    public BodyTreatment update(BodyTreatment treatment) {
        bodyTreatmentMap.put(treatment.toString(),treatment);
        BodyTreatment savedTreatment = bodyTreatmentMap.get(toString());
        return savedTreatment;
    }

    @Override
    public void delete(String b) {
        bodyTreatmentMap.remove(toString());
    }

    @Override
    public Set<BodyTreatment> getAll() {
        return (Set<BodyTreatment>) bodyTreatmentMap;
    }
}
