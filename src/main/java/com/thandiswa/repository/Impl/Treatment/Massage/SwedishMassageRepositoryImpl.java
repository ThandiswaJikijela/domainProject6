package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.repository.Treatment.Massage.SwedishMassageRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        massageMap.put(swedishMassage.getCarrierOil(),swedishMassage);
        SwedishMassage savedSwedishMassage = massageMap.get(toString());
        return savedSwedishMassage;
    }

    @Override
    public SwedishMassage read(String s) {
        SwedishMassage swedishMassage = massageMap.get(toString());
        return swedishMassage;
    }

    @Override
    public SwedishMassage update(SwedishMassage swedishMassage) {
        massageMap.put(swedishMassage.toString(),swedishMassage);
        SwedishMassage savedSwedishMassage = massageMap.get(toString());
        return savedSwedishMassage;
    }

    @Override
    public void delete(String s) {
        massageMap.remove(toString());
    }

    @Override
    public Set<SwedishMassage> getAll() {
        return (Set<SwedishMassage>) massageMap;
    }
}
