package com.thandiswa.repository.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.repository.Treatment.Body.BodyWrapsRepository;

import java.util.*;

public class BodyWrapsRepositoryImpl implements BodyWrapsRepository {

    private static BodyWrapsRepositoryImpl repository = null;
    private Map<String, BodyWraps> bodyWrapsMap;

    private BodyWrapsRepositoryImpl(){
        this.bodyWrapsMap = new HashMap<String, BodyWraps>();
    }

    public static BodyWrapsRepositoryImpl getRepository()
    {
        if (repository == null) repository = new BodyWrapsRepositoryImpl();
        return repository;
    }

    @Override
    public BodyWraps create(BodyWraps bodyWraps) {
        this.bodyWrapsMap.put(bodyWraps.toString(),bodyWraps);
        return bodyWraps;
    }

    @Override
    public BodyWraps read(String bw) {
        BodyWraps bodyWraps = bodyWrapsMap.get(toString());
        return bodyWraps;
    }

    @Override
    public BodyWraps update(BodyWraps bodyWraps) {
        this.bodyWrapsMap.replace(bodyWraps.toString(),bodyWraps);
        return this.bodyWrapsMap.get(bodyWraps.toString());
    }

    @Override
    public void delete(String bw) {
        bodyWrapsMap.remove(toString());
    }

    @Override
    public Set<BodyWraps> getAll() {
        Collection<BodyWraps> bodyWraps = this.bodyWrapsMap.values();
        Set<BodyWraps> set = new HashSet<>();
        set.addAll(bodyWraps);
        return set;
    }
}
