package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.repository.Treatment.Facial.AntiAgingFacialRepository;

import java.util.*;

public class AntiAgingFacialRepositoryImpl implements AntiAgingFacialRepository {

    private static AntiAgingFacialRepositoryImpl repository = null;
    private Map<String, AntAgingFacial> agingFacialMap;

    private AntiAgingFacialRepositoryImpl(){
        this.agingFacialMap = new HashMap<String, AntAgingFacial>();
    }

    public static AntiAgingFacialRepositoryImpl getRepository()
    {
        if (repository == null) repository = new AntiAgingFacialRepositoryImpl();
        return repository;
    }

    @Override
    public AntAgingFacial create(AntAgingFacial agingFacial) {
        this.agingFacialMap.put(agingFacial.toString(),agingFacial);
        return agingFacial;
    }

    @Override
    public AntAgingFacial read(String af) {
        AntAgingFacial agingFacial = agingFacialMap.get(toString());
        return agingFacial;
    }

    @Override
    public AntAgingFacial update(AntAgingFacial agingFacial) {
        this.agingFacialMap.replace(agingFacial.toString(),agingFacial);
        return this.agingFacialMap.get(agingFacial.toString());
    }

    @Override
    public void delete(String af) {
        agingFacialMap.remove(toString());
    }

    @Override
    public Set<AntAgingFacial> getAll() {
        Collection<AntAgingFacial> agingFacials = this.agingFacialMap.values();
        Set<AntAgingFacial> set = new HashSet<>();
        set.addAll(agingFacials);
        return set;
    }
}
