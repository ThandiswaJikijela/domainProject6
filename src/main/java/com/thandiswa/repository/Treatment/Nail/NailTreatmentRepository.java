package com.thandiswa.repository.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface NailTreatmentRepository extends IRepository<NailTreatment, String> {
    Set<NailTreatment> getAll();
}
