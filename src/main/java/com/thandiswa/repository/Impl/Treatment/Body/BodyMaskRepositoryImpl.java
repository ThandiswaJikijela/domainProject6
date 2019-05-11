package com.thandiswa.repository.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.repository.Treatment.Body.BodyMaskRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        bodyMaskMap.put(bodyMask.getMaskIngredients(),bodyMask);
        BodyMask savedBodyMask= bodyMaskMap.get(toString());
        return savedBodyMask;
    }

    @Override
    public BodyMask read(String b) {
        BodyMask bodyMask = bodyMaskMap.get(toString());
        return bodyMask;
    }

    @Override
    public BodyMask update(BodyMask bodyMask) {
        bodyMaskMap.put(bodyMask.toString(),bodyMask);
        BodyMask savedBodyMask = bodyMaskMap.get(toString());
        return savedBodyMask;
    }

    @Override
    public void delete(String b) {
        bodyMaskMap.remove(toString());
    }

    @Override
    public Set<BodyMask> getAll() {
        return (Set<BodyMask>) bodyMaskMap;
    }
}
