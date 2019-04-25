package repository.Treatment.Massage;

import domain.Treatment.Massage.TissueMassage;
import repository.IRepository;

import java.util.Set;

public interface TissueMassageRepository extends IRepository<TissueMassage, String> {
    Set<TissueMassage> getAll();
}
