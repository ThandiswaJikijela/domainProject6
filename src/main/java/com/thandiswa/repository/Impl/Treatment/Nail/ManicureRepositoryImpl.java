package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.repository.Treatment.Nail.ManicureRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        manicureMap.put(manicure.getNailStyle(),manicure);
        Manicure savedManicure = manicureMap.get(toString());
        return savedManicure;
    }

    @Override
    public Manicure read(String m) {
        Manicure manicure = manicureMap.get(toString());
        return manicure;
    }

    @Override
    public Manicure update(Manicure manicure) {
        manicureMap.put(manicure.toString(),manicure);
        Manicure savedManicure = manicureMap.get(toString());
        return savedManicure;
    }

    @Override
    public void delete(String m) {
        manicureMap.remove(toString());
    }

    @Override
    public Set<Manicure> getAll() {
        return (Set<Manicure>) manicureMap;
    }
}
