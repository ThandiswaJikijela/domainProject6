package repository.Treatment.Body;

import domain.Treatment.Body.BodyWraps;
import repository.IRepository;

import java.util.Set;

public interface BodyWrapsRepository extends IRepository<BodyWraps, String> {
    Set<BodyWraps> getAll();
}
