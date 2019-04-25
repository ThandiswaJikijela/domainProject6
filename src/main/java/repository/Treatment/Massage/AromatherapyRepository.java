package repository.Treatment.Massage;

import domain.Treatment.Massage.Aromatherapy;
import repository.IRepository;

import java.util.Set;

public interface AromatherapyRepository extends IRepository<Aromatherapy, String> {
    Set<Aromatherapy> getAll();
}
