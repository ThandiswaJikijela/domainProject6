package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.repository.Treatment.Massage.SwedishMassageRepository;

import java.util.*;

public class SwedishMassageRepositoryImpl implements SwedishMassageRepository {

    private static SwedishMassageRepositoryImpl repository = null;
    private Map<String, SwedishMassage> massageMap;

    private SwedishMassageRepositoryImpl(){
        this.massageMap = new HashMap<String, SwedishMassage>();
    }

    public static SwedishMassageRepositoryImpl getRepository()
    {
        if (repository == null) repository = new SwedishMassageRepositoryImpl();
        return repository;
    }

    @Override
    public SwedishMassage create(SwedishMassage swedishMassage) {
        this.massageMap.put(swedishMassage.toString(),swedishMassage);
        return swedishMassage;
    }

    @Override
    public SwedishMassage read(String s) {
        SwedishMassage swedishMassage = massageMap.get(toString());
        return swedishMassage;
    }

    @Override
    public SwedishMassage update(SwedishMassage swedishMassage) {
        this.massageMap.replace(swedishMassage.toString(),swedishMassage);
        return this.massageMap.get(swedishMassage.toString());
    }

    @Override
    public void delete(String s) {
        massageMap.remove(toString());
    }

    @Override
    public Set<SwedishMassage> getAll() {
        Collection<SwedishMassage> swedishMassages = this.massageMap.values();
        Set<SwedishMassage> set = new HashSet<>();
        set.addAll(swedishMassages);
        return set;
    }
}
