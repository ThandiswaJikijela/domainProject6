package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.repository.Treatment.Nail.PedicureRepository;

import java.util.*;

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
        this.pedicureMap.put(pedicure.toString(),pedicure);
        return pedicure;
    }

    @Override
    public Pedicure read(String mp) {
        Pedicure pedicure = pedicureMap.get(toString());
        return pedicure;
    }

    @Override
    public Pedicure update(Pedicure pedicure) {
        this.pedicureMap.replace(pedicure.toString(),pedicure);
        return this.pedicureMap.get(pedicure.toString());
    }

    @Override
    public void delete(String mp) {
        pedicureMap.remove(toString());
    }

    @Override
    public Set<Pedicure> getAll() {
        Collection<Pedicure> pedicures = this.pedicureMap.values();
        Set<Pedicure> set = new HashSet<>();
        set.addAll(pedicures);
        return set;
    }
}
