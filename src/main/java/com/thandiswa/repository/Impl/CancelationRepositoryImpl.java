package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.repository.CancelationRepository;

import java.util.*;

public class CancelationRepositoryImpl implements CancelationRepository {

    private static CancelationRepositoryImpl repository = null;
    private Map<String, Cancelation> cancelationMap;

    private CancelationRepositoryImpl(){
        this.cancelationMap = new HashMap<String, Cancelation>();
    }

    public static CancelationRepositoryImpl getRepository()
    {
        if (repository == null) repository = new CancelationRepositoryImpl();
        return repository;
    }

    @Override
    public Cancelation create(Cancelation cancelation) {
        this.cancelationMap.put(cancelation.toString(),cancelation);
        return cancelation;
    }

    @Override
    public Cancelation read(String c) {
        Cancelation cancelation = cancelationMap.get(toString());
        return cancelation;
    }

    @Override
    public Cancelation update(Cancelation cancelation) {
        this.cancelationMap.replace(cancelation.toString(),cancelation);
        return this.cancelationMap.get(cancelation.toString());
    }

    @Override
    public void delete(String c) {
        cancelationMap.remove(toString());
    }

    @Override
    public Set<Cancelation> getAll() {
        Collection<Cancelation> cancelations = this.cancelationMap.values();
        Set<Cancelation> set = new HashSet<>();
        set.addAll(cancelations);
        return set;
    }
}
