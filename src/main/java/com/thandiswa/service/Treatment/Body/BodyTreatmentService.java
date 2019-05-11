package com.thandiswa.service.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.service.IService;

import java.util.Set;

public interface BodyTreatmentService extends IService<BodyTreatment, String> {
    Set<BodyTreatment> getAll();
}
