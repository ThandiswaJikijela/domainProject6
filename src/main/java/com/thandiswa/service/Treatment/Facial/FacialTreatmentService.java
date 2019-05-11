package com.thandiswa.service.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.service.IService;

import java.util.Set;

public interface FacialTreatmentService extends IService<FacialTreatment, String> {
    Set<FacialTreatment> getAll();
}
