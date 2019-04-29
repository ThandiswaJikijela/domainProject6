package repository.Impl.Treatment.Body;

import domain.Treatment.Body.BodyWraps;
import repository.Treatment.Body.BodyWrapsRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        bodyWrapsMap.put(bodyWraps.getWrapMaterials(),bodyWraps);
        BodyWraps savedBodyWraps = bodyWrapsMap.get(toString());
        return savedBodyWraps;
    }

    @Override
    public BodyWraps read(String bw) {
        BodyWraps bodyWraps = bodyWrapsMap.get(toString());
        return bodyWraps;
    }

    @Override
    public BodyWraps update(BodyWraps bodyWraps) {
        bodyWrapsMap.put(bodyWraps.toString(),bodyWraps);
        BodyWraps savedBodyWraps = bodyWrapsMap.get(toString());
        return savedBodyWraps;
    }

    @Override
    public void delete(String bw) {
        bodyWrapsMap.remove(toString());
    }

    @Override
    public Set<BodyWraps> getAll() {
        return (Set<BodyWraps>) bodyWrapsMap;
    }
}
