package repository.Treatment.Body;

import domain.Treatment.Body.BodyMask;
import repository.IRepository;

import java.util.Set;

public interface BodyMaskRepository extends IRepository<BodyMask, String> {
    Set<BodyMask> getAll();
}
