package repository.Impl.Treatment.Body;

import domain.Treatment.Body.BodyScrub;
import repository.Treatment.Body.BodyScrubRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        scrubMap.put(bodyScrub.getGrittyIngredients(),bodyScrub);
        BodyScrub savedBodyScrub = scrubMap.get(toString());
        return savedBodyScrub;
    }

    @Override
    public BodyScrub read(String bs) {
        BodyScrub bodyScrub = scrubMap.get(toString());
        return bodyScrub;
    }

    @Override
    public BodyScrub update(BodyScrub bodyScrub) {
        scrubMap.put(bodyScrub.toString(),bodyScrub);
        BodyScrub savedBodyScrub = scrubMap.get(toString());
        return savedBodyScrub;
    }

    @Override
    public void delete(String bs) {
        scrubMap.remove(toString());
    }

    @Override
    public Set<BodyScrub> getAll() {
        return (Set<BodyScrub>) scrubMap;
    }
}
