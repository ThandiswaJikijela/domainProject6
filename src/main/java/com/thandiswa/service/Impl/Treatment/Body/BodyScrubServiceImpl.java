package com.thandiswa.service.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.repository.Impl.Treatment.Body.BodyScrubRepositoryImpl;
import com.thandiswa.repository.Treatment.Body.BodyScrubRepository;
import com.thandiswa.service.Treatment.Body.BodyScrubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BodyScrubServiceImpl implements BodyScrubService {
    //@Autowired
    @Qualifier("InMemory")
    private static BodyScrubServiceImpl service = null;
    private BodyScrubRepository repository;

    private BodyScrubServiceImpl() {
        this.repository = BodyScrubRepositoryImpl.getRepository();
    }

    public static BodyScrubServiceImpl getService(){
        if (service == null) service = new BodyScrubServiceImpl();
        return service;
    }

    @Override
    public BodyScrub create(BodyScrub bodyScrub) {
        return this.repository.create(bodyScrub);
    }

    @Override
    public BodyScrub update(BodyScrub bodyScrub) {
        return this.repository.update(bodyScrub);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public BodyScrub read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<BodyScrub> getAll() {
        return this.repository.getAll();
    }
}
