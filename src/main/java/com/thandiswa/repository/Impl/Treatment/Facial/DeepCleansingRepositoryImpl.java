package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.repository.Treatment.Facial.DeepCleansingRepository;

import java.util.*;

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
        this.deepCleansingMap.put(deepCleansing.toString(),deepCleansing);
        return deepCleansing;
    }

    @Override
    public DeepCleansing read(String d) {
        DeepCleansing deepCleansing = deepCleansingMap.get(toString());
        return deepCleansing;
    }

    @Override
    public DeepCleansing update(DeepCleansing deepCleansing) {
        this.deepCleansingMap.replace(deepCleansing.toString(),deepCleansing);
        return this.deepCleansingMap.get(deepCleansing.toString());
    }

    @Override
    public void delete(String d) {
        deepCleansingMap.remove(toString());
    }

    @Override
    public Set<DeepCleansing> getAll() {
        Collection<DeepCleansing> deepCleansings = this.deepCleansingMap.values();
        Set<DeepCleansing> set = new HashSet<>();
        set.addAll(deepCleansings);
        return set;
    }
}
