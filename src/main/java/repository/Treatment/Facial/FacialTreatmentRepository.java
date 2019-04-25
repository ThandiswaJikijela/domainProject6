package repository.Treatment.Facial;

import domain.Treatment.Facial.FacialTreatment;
import repository.IRepository;

import java.util.Set;

public interface FacialTreatmentRepository extends IRepository<FacialTreatment, String> {
    Set<FacialTreatment> getAll();
}
