package repository.Treatment.Massage;

import domain.Treatment.Massage.SwedishMassage;
import repository.IRepository;

import java.util.Set;

public interface SwedishMassageRepository extends IRepository<SwedishMassage, String> {
    Set<SwedishMassage> getAll();
}
