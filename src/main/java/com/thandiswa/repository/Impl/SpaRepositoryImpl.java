package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Spa;
import com.thandiswa.repository.SpaRepository;

import java.util.*;

public class SpaRepositoryImpl implements SpaRepository {
    private static SpaRepositoryImpl repository = null;
    private Map<String, Spa> spaTable;

    private SpaRepositoryImpl(){
        this.spaTable = new HashMap<String, Spa>();
    }

    public static SpaRepositoryImpl getRepository()
    {
        if (repository == null) repository = new SpaRepositoryImpl();
        return repository;
    }

    @Override
    public Spa create(Spa spa) {
        this.spaTable.put(spa.toString(),spa);
        return spa;
    }

    @Override
    public Spa read(String sp) {
        Spa spa = spaTable.get(toString());
        return spa;
    }

    @Override
    public Spa update(Spa spa) {
        this.spaTable.replace(spa.toString(),spa);
        return this.spaTable.get(spa.toString());
    }

    @Override
    public void delete(String sp) {
        spaTable.remove(toString());
    }

    @Override
    public Set<Spa> getAll() {
        Collection<Spa> spas = this.spaTable.values();
        Set<Spa> set = new HashSet<>();
        set.addAll(spas);
        return set;
    }

}
