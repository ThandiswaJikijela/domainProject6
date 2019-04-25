package repository.Treatment.Nail;

import domain.Treatment.Nail.Pedicure;
import repository.IRepository;

import java.util.Set;

public interface PedicureRepository extends IRepository<Pedicure, String> {
    Set<Pedicure> getAll();
}
