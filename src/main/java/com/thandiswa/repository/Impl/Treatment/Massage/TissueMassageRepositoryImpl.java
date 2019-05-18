package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.repository.Treatment.Massage.TissueMassageRepository;

import java.util.*;

public class TissueMassageRepositoryImpl implements TissueMassageRepository {

    private static TissueMassageRepositoryImpl repository = null;
    private Map<String, TissueMassage> tissueMassageMap;

    private TissueMassageRepositoryImpl(){
        this.tissueMassageMap = new HashMap<String, TissueMassage>();
    }

    public static TissueMassageRepositoryImpl getRepository()
    {
        if (repository == null) repository = new TissueMassageRepositoryImpl();
        return repository;
    }

    @Override
    public TissueMassage create(TissueMassage tissueMassage) {
        this.tissueMassageMap.put(tissueMassage.toString(),tissueMassage);
        return tissueMassage;
    }

    @Override
    public TissueMassage read(String t) {
        TissueMassage tissueMassage = tissueMassageMap.get(toString());
        return tissueMassage;
    }

    @Override
    public TissueMassage update(TissueMassage tissueMassage) {
        this.tissueMassageMap.replace(tissueMassage.toString(),tissueMassage);
        return this.tissueMassageMap.get(tissueMassage.toString());
    }

    @Override
    public void delete(String t) {
        tissueMassageMap.remove(toString());
    }

    @Override
    public Set<TissueMassage> getAll() {
        Collection<TissueMassage> tissueMassages = this.tissueMassageMap.values();
        Set<TissueMassage> set = new HashSet<>();
        set.addAll(tissueMassages);
        return set;
    }
}
