package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.repository.Treatment.Nail.PedicureRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PedicureRepositoryImpl implements PedicureRepository {

    private static PedicureRepositoryImpl repository = null;
    private Map<String, Pedicure> pedicureMap;

    private PedicureRepositoryImpl(){
        this.pedicureMap = new HashMap<String, Pedicure>();
    }

    public static PedicureRepositoryImpl getRepository()
    {
        if (repository == null) repository = new PedicureRepositoryImpl();
        return repository;
    }

    @Override
    public Pedicure create(Pedicure pedicure) {
        pedicureMap.put(pedicure.getMediHeelPedicure(),pedicure);
        Pedicure savedPedicure = pedicureMap.get(toString());
        return savedPedicure;
    }

    @Override
    public Pedicure read(String mp) {
        Pedicure pedicure = pedicureMap.get(toString());
        return pedicure;
    }

    @Override
    public Pedicure update(Pedicure pedicure) {
        pedicureMap.put(pedicure.toString(),pedicure);
        Pedicure savedPedicure = pedicureMap.get(toString());
        return savedPedicure;
    }

    @Override
    public void delete(String mp) {
        pedicureMap.remove(toString());
    }

    @Override
    public Set<Pedicure> getAll() {
        return (Set<Pedicure>) pedicureMap;
    }
}
