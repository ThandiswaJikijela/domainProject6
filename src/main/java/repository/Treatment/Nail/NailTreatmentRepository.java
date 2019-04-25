package repository.Treatment.Nail;

import domain.Treatment.Nail.NailTreatment;
import repository.IRepository;

import java.util.Set;

public interface NailTreatmentRepository extends IRepository<NailTreatment, String> {
    Set<NailTreatment> getAll();
}
