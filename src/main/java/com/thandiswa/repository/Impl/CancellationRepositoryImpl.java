package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Cancellation;
import com.thandiswa.repository.CancellationRepository;

import java.util.*;

public class CancellationRepositoryImpl implements CancellationRepository {

    private static CancellationRepositoryImpl repository = null;
    private Map<String, Cancellation> cancelationMap;

    private CancellationRepositoryImpl(){
        this.cancelationMap = new HashMap<String, Cancellation>();
    }

    public static CancellationRepositoryImpl getRepository()
    {
        if (repository == null) repository = new CancellationRepositoryImpl();
        return repository;
    }

    @Override
    public Cancellation create(Cancellation cancellation) {
        this.cancelationMap.put(cancellation.toString(), cancellation);
        return cancellation;
    }

    @Override
    public Cancellation read(String c) {
        Cancellation cancellation = cancelationMap.get(toString());
        return cancellation;
    }

    @Override
    public Cancellation update(Cancellation cancellation) {
        this.cancelationMap.replace(cancellation.toString(), cancellation);
        return this.cancelationMap.get(cancellation.toString());
    }

    @Override
    public void delete(String c) {
        cancelationMap.remove(toString());
    }

    @Override
    public Set<Cancellation> getAll() {
        Collection<Cancellation> cancellations = this.cancelationMap.values();
        Set<Cancellation> set = new HashSet<>();
        set.addAll(cancellations);
        return set;
    }
}
