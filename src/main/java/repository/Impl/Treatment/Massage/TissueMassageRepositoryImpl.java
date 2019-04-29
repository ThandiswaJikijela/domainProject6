package repository.Impl.Treatment.Massage;

import domain.Treatment.Massage.TissueMassage;
import repository.Treatment.Massage.TissueMassageRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TissueMassageRepositoryImpl implements TissueMassageRepository {

    private static TissueMassageRepositoryImpl repository = null;
    private Map<String, TissueMassage> tissueMassageMap;

    private TissueMassageRepositoryImpl(){
        this.tissueMassageMap = new HashMap<String, TissueMassage>();
    }

    public static TissueMassageRepositoryImpl getRepository()
    {
        if (repository == null) repository = new TissueMassageRepositoryImpl();
        return repository;
    }

    @Override
    public TissueMassage create(TissueMassage tissueMassage) {
        tissueMassageMap.put(tissueMassage.getMassagePressure(),tissueMassage);
        TissueMassage savedTissueMassage = tissueMassageMap.get(toString());
        return savedTissueMassage;
    }

    @Override
    public TissueMassage read(String t) {
        TissueMassage tissueMassage = tissueMassageMap.get(toString());
        return tissueMassage;
    }

    @Override
    public TissueMassage update(TissueMassage tissueMassage) {
        tissueMassageMap.put(tissueMassage.toString(),tissueMassage);
        TissueMassage savedTissueMassage = tissueMassageMap.get(toString());
        return savedTissueMassage;
    }

    @Override
    public void delete(String t) {
        tissueMassageMap.remove(toString());
    }

    @Override
    public Set<TissueMassage> getAll() {
        return (Set<TissueMassage>) tissueMassageMap;
    }
}
