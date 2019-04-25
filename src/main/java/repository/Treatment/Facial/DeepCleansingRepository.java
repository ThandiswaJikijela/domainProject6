package repository.Treatment.Facial;

import domain.Treatment.Facial.DeepCleansing;
import repository.IRepository;

import java.util.Set;

public interface DeepCleansingRepository extends IRepository<DeepCleansing, String> {
    Set<DeepCleansing> getAll();
}
