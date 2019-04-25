package repository.Treatment.Body;

import domain.Treatment.Body.BodyScrub;
import repository.IRepository;

import java.util.Set;

public interface BodyScrubRepository extends IRepository<BodyScrub, String> {
    Set<BodyScrub> getAll();
}
