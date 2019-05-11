package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.repository.Treatment.Facial.AntiAgingFacialRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        agingFacialMap.put(agingFacial.getPoreIngredients(),agingFacial);
        AntAgingFacial savedAntAgingFacial = agingFacialMap.get(toString());
        return savedAntAgingFacial;
    }

    @Override
    public AntAgingFacial read(String af) {
        AntAgingFacial agingFacial = agingFacialMap.get(toString());
        return agingFacial;
    }

    @Override
    public AntAgingFacial update(AntAgingFacial agingFacial) {
        agingFacialMap.put(agingFacial.toString(),agingFacial);
        AntAgingFacial savedAntAgingFacial = agingFacialMap.get(toString());
        return savedAntAgingFacial;
    }

    @Override
    public void delete(String af) {
        agingFacialMap.remove(toString());
    }

    @Override
    public Set<AntAgingFacial> getAll() {
        return (Set<AntAgingFacial>) agingFacialMap;
    }
}
