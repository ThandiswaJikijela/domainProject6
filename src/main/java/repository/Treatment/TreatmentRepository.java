package repository.Treatment;

import domain.Treatment.Treatment;
import repository.IRepository;

import java.util.Set;

public interface TreatmentRepository extends IRepository<Treatment, String> {
    Set<Treatment> getAll();
}
