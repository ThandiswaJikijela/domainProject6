package com.thandiswa.service.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.repository.Impl.Treatment.Body.BodyMaskRepositoryImpl;
import com.thandiswa.repository.Treatment.Body.BodyMaskRepository;
import com.thandiswa.service.Treatment.Body.BodyMaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceMaskImpl")
public class BodyMaskServiceImpl implements BodyMaskService {
    @Autowired
    @Qualifier("InMemory")
    private static BodyMaskServiceImpl service = null;
    private BodyMaskRepository repository;

    private BodyMaskServiceImpl() {
        this.repository = BodyMaskRepositoryImpl.getRepository();
    }

    public static BodyMaskServiceImpl getService(){
        if (service == null) service = new BodyMaskServiceImpl();
        return service;
    }

    @Override
    public BodyMask create(BodyMask bodyMask) {
        return this.repository.create(bodyMask);
    }

    @Override
    public BodyMask update(BodyMask bodyMask) {
        return this.repository.update(bodyMask);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public BodyMask read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<BodyMask> getAll() {
        return this.repository.getAll();
    }
}
