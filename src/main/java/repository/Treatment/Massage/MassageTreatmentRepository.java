package repository.Treatment.Massage;

import domain.Treatment.Massage.MassageTreatment;
import repository.IRepository;

import java.util.Set;

public interface MassageTreatmentRepository extends IRepository<MassageTreatment, String> {
    Set<MassageTreatment> getAll();
}
