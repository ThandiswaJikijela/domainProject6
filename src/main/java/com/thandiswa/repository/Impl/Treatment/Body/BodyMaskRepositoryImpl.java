package com.thandiswa.repository.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.repository.Treatment.Body.BodyMaskRepository;

import java.util.*;

public class BodyMaskRepositoryImpl implements BodyMaskRepository {

    private static BodyMaskRepositoryImpl repository = null;
    private Map<String, BodyMask> bodyMaskMap;

    private BodyMaskRepositoryImpl(){
        this.bodyMaskMap = new HashMap<String, BodyMask>();
    }

    public static BodyMaskRepositoryImpl getRepository()
    {
        if (repository == null) repository = new BodyMaskRepositoryImpl();
        return repository;
    }

    @Override
    public BodyMask create(BodyMask bodyMask) {
        this.bodyMaskMap.put(bodyMask.toString(),bodyMask);
        return bodyMask;
    }

    @Override
    public BodyMask read(String b) {
        BodyMask bodyMask = bodyMaskMap.get(toString());
        return bodyMask;
    }

    @Override
    public BodyMask update(BodyMask bodyMask) {
        this.bodyMaskMap.replace(bodyMask.toString(),bodyMask);
        return this.bodyMaskMap.get(bodyMask.toString());
    }

    @Override
    public void delete(String b) {
        bodyMaskMap.remove(toString());
    }

    @Override
    public Set<BodyMask> getAll() {
        Collection<BodyMask> bodyMasks = this.bodyMaskMap.values();
        Set<BodyMask> set = new HashSet<>();
        set.addAll(bodyMasks);
        return set;
    }
}
