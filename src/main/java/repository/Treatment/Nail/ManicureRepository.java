package repository.Treatment.Nail;

import domain.Treatment.Nail.Manicure;
import repository.IRepository;

import java.util.Set;

public interface ManicureRepository extends IRepository<Manicure, String> {
    Set<Manicure> getAll();
}
