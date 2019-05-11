package com.thandiswa.repository.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface MassageTreatmentRepository extends IRepository<MassageTreatment, String> {
    Set<MassageTreatment> getAll();
}
