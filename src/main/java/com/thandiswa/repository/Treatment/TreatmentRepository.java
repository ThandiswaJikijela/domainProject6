package com.thandiswa.repository.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface TreatmentRepository extends IRepository<Treatment, String> {
    Set<Treatment> getAll();
}
