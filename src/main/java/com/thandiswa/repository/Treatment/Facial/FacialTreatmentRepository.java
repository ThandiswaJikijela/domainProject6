package com.thandiswa.repository.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface FacialTreatmentRepository extends IRepository<FacialTreatment, String> {
    Set<FacialTreatment> getAll();
}
