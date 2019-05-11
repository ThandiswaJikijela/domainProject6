package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.repository.CancelationRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        cancelationMap.put(cancelation.getPaymentMethod(),cancelation);
        Cancelation savedCancelation = cancelationMap.get(toString());
        return savedCancelation;
    }

    @Override
    public Cancelation read(String c) {
        Cancelation cancelation = cancelationMap.get(toString());
        return cancelation;
    }

    @Override
    public Cancelation update(Cancelation cancelation) {
        cancelationMap.put(cancelation.toString(),cancelation);
        Cancelation savedCancelation = cancelationMap.get(toString());
        return savedCancelation;
    }

    @Override
    public void delete(String c) {
        cancelationMap.remove(toString());
    }

    @Override
    public Set<Cancelation> getAll() {
        return (Set<Cancelation>) cancelationMap;
    }
}
