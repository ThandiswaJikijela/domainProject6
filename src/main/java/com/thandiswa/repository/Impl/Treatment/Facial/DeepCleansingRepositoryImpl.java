package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.repository.Treatment.Facial.DeepCleansingRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DeepCleansingRepositoryImpl implements DeepCleansingRepository {

    private static DeepCleansingRepositoryImpl repository = null;
    private Map<String, DeepCleansing> deepCleansingMap;

    private DeepCleansingRepositoryImpl(){
        this.deepCleansingMap = new HashMap<String, DeepCleansing>();
    }

    public static DeepCleansingRepositoryImpl getRepository()
    {
        if (repository == null) repository = new DeepCleansingRepositoryImpl();
        return repository;
    }

    @Override
    public DeepCleansing create(DeepCleansing deepCleansing) {
        deepCleansingMap.put(deepCleansing.getFacialID(),deepCleansing);
        deepCleansingMap.put(deepCleansing.getOilTypes(),deepCleansing);
        DeepCleansing savedDeepCleansing = deepCleansingMap.get(toString());
        return savedDeepCleansing;
    }

    @Override
    public DeepCleansing read(String d) {
        DeepCleansing deepCleansing = deepCleansingMap.get(toString());
        return deepCleansing;
    }

    @Override
    public DeepCleansing update(DeepCleansing deepCleansing) {
        deepCleansingMap.put(deepCleansing.toString(),deepCleansing);
        DeepCleansing savedDeepCleansing = deepCleansingMap.get(toString());
        return savedDeepCleansing;
    }

    @Override
    public void delete(String d) {
        deepCleansingMap.remove(toString());
    }

    @Override
    public Set<DeepCleansing> getAll() {
        return (Set<DeepCleansing>) deepCleansingMap;
    }
}
