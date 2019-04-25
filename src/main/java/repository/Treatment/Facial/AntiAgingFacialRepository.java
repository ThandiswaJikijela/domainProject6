package repository.Treatment.Facial;

import domain.Treatment.Facial.AntAgingFacial;
import repository.IRepository;

import java.util.Set;

public interface AntiAgingFacialRepository extends IRepository<AntAgingFacial, String> {
    Set<AntAgingFacial> getAll();
}
