package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.repository.Treatment.Massage.AromatherapyRepository;

import java.util.*;

public class AromatherapyRepositoryImpl implements AromatherapyRepository {

    private static AromatherapyRepositoryImpl repository = null;
    private Map<String, Aromatherapy> aromatherapyMap;

    private AromatherapyRepositoryImpl(){
        this.aromatherapyMap = new HashMap<String, Aromatherapy>();
    }

    public static AromatherapyRepositoryImpl getRepository()
    {
        if (repository == null) repository = new AromatherapyRepositoryImpl();
        return repository;
    }

    @Override
    public Aromatherapy create(Aromatherapy aromatherapy) {
        this.aromatherapyMap.put(aromatherapy.toString(),aromatherapy);
        return aromatherapy;
    }

    @Override
    public Aromatherapy read(String c) {
        Aromatherapy aromatherapy = aromatherapyMap.get(toString());
        return aromatherapy;
    }

    @Override
    public Aromatherapy update(Aromatherapy aromatherapy) {
        this.aromatherapyMap.replace(aromatherapy.toString(),aromatherapy);
        return this.aromatherapyMap.get(aromatherapy.toString());
    }

    @Override
    public void delete(String c) {
        aromatherapyMap.remove(toString());
    }

    @Override
    public Set<Aromatherapy> getAll() {
        Collection<Aromatherapy> aromatherapies = this.aromatherapyMap.values();
        Set<Aromatherapy> set = new HashSet<>();
        set.addAll(aromatherapies);
        return set;
    }
}
