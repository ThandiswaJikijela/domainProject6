package repository.Treatment.Body;

import domain.Treatment.Body.BodyTreatment;
import repository.IRepository;

import java.util.Set;

public interface BodyTreatmentRepository extends IRepository<BodyTreatment, String> {
    Set<BodyTreatment> getAll();
}
