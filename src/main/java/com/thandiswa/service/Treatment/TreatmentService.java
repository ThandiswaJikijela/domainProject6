package com.thandiswa.service.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.service.IService;

import java.util.Set;

public interface TreatmentService extends IService<Treatment, String> {
    Set<Treatment> getAll();
}
