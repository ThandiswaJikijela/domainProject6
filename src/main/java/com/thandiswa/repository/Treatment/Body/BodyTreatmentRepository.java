package com.thandiswa.repository.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface BodyTreatmentRepository extends IRepository<BodyTreatment, String> {
    Set<BodyTreatment> getAll();
}
