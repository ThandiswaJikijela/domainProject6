package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Spa;
import com.thandiswa.repository.SpaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        spaTable.put(spa.getSpaName(),spa);
        spaTable.put(spa.getAddress(),spa);
        Spa savedSpa = spaTable.get(toString());
        return savedSpa;
    }

    @Override
    public Spa read(String sp) {
        Spa spa = spaTable.get(toString());
        return spa;
    }

    @Override
    public Spa update(Spa spa) {
        spaTable.put(spa.toString(),spa);
        Spa savedSpa = spaTable.get(toString());
        return savedSpa;
    }

    @Override
    public void delete(String sp) {
        spaTable.remove(toString());
    }

    @Override
    public Set<Spa> getAll() {
        return (Set<Spa>) spaTable;
    }

}
