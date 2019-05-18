package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.repository.Treatment.Nail.ManicureRepository;

import java.util.*;

public class ManicureRepositoryImpl implements ManicureRepository {

    private static ManicureRepositoryImpl repository = null;
    private Map<String, Manicure> manicureMap;

    private ManicureRepositoryImpl(){
        this.manicureMap = new HashMap<String, Manicure>();
    }

    public static ManicureRepositoryImpl getRepository()
    {
        if (repository == null) repository = new ManicureRepositoryImpl();
        return repository;
    }

    @Override
    public Manicure create(Manicure manicure) {
        this.manicureMap.put(manicure.toString(),manicure);
        return manicure;
    }

    @Override
    public Manicure read(String m) {
        Manicure manicure = manicureMap.get(toString());
        return manicure;
    }

    @Override
    public Manicure update(Manicure manicure) {
        this.manicureMap.replace(manicure.toString(),manicure);
        return this.manicureMap.get(manicure.toString());
    }

    @Override
    public void delete(String m) {
        manicureMap.remove(toString());
    }

    @Override
    public Set<Manicure> getAll() {
        Collection<Manicure> manicures = this.manicureMap.values();
        Set<Manicure> set = new HashSet<>();
        set.addAll(manicures);
        return set;
    }
}
