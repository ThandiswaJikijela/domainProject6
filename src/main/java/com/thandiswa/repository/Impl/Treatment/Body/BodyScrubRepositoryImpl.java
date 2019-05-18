package com.thandiswa.repository.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.repository.Treatment.Body.BodyScrubRepository;

import java.util.*;

public class BodyScrubRepositoryImpl implements BodyScrubRepository {

    private static BodyScrubRepositoryImpl repository = null;
    private Map<String, BodyScrub> scrubMap;

    private BodyScrubRepositoryImpl(){
        this.scrubMap = new HashMap<String, BodyScrub>();
    }

    public static BodyScrubRepositoryImpl getRepository()
    {
        if (repository == null) repository = new BodyScrubRepositoryImpl();
        return repository;
    }

    @Override
    public BodyScrub create(BodyScrub bodyScrub) {
        this.scrubMap.put(bodyScrub.toString(),bodyScrub);
        return bodyScrub;
    }

    @Override
    public BodyScrub read(String bs) {
        BodyScrub bodyScrub = scrubMap.get(toString());
        return bodyScrub;
    }

    @Override
    public BodyScrub update(BodyScrub bodyScrub) {
        this.scrubMap.replace(bodyScrub.toString(),bodyScrub);
        return this.scrubMap.get(bodyScrub.toString());
    }

    @Override
    public void delete(String bs) {
        scrubMap.remove(toString());
    }

    @Override
    public Set<BodyScrub> getAll() {
        Collection<BodyScrub> bodyScrubs = this.scrubMap.values();
        Set<BodyScrub> set = new HashSet<>();
        set.addAll(bodyScrubs);
        return set;
    }
}
