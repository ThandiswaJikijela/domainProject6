package com.thandiswa.service.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.repository.Impl.Treatment.Massage.TissueMassageRepositoryImpl;
import com.thandiswa.repository.Treatment.Massage.TissueMassageRepository;
import com.thandiswa.service.Treatment.Massage.TissueMassageService;

import java.util.Set;

public class TissueMassageServiceImpl implements TissueMassageService {
    private static TissueMassageServiceImpl service = null;
    private TissueMassageRepository repository;

    private TissueMassageServiceImpl() {
        this.repository = TissueMassageRepositoryImpl.getRepository();
    }

    public static TissueMassageServiceImpl getService(){
        if (service == null) service = new TissueMassageServiceImpl();
        return service;
    }

    @Override
    public TissueMassage create(TissueMassage tissueMassage) {
        return this.repository.create(tissueMassage);
    }

    @Override
    public TissueMassage update(TissueMassage tissueMassage) {
        return this.repository.update(tissueMassage);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public TissueMassage read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<TissueMassage> getAll() {
        return this.repository.getAll();
    }
}
