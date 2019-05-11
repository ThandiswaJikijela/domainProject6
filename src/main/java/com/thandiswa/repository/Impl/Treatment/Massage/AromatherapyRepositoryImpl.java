package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.repository.Treatment.Massage.AromatherapyRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        aromatherapyMap.put(aromatherapy.getFragrantEssentialOil(),aromatherapy);
        Aromatherapy savedAromatherapy = aromatherapyMap.get(toString());
        return savedAromatherapy;
    }

    @Override
    public Aromatherapy read(String c) {
        Aromatherapy aromatherapy = aromatherapyMap.get(toString());
        return aromatherapy;
    }

    @Override
    public Aromatherapy update(Aromatherapy aromatherapy) {
        aromatherapyMap.put(aromatherapy.toString(),aromatherapy);
        Aromatherapy savedAromatherapy = aromatherapyMap.get(toString());
        return savedAromatherapy;
    }

    @Override
    public void delete(String c) {
        aromatherapyMap.remove(toString());
    }

    @Override
    public Set<Aromatherapy> getAll() {
        return (Set<Aromatherapy>) aromatherapyMap;
    }
}
