package com.thandiswa.service.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.service.IService;

import java.util.Set;

public interface NailTreatmentService extends IService<NailTreatment, String> {
    Set<NailTreatment> getAll();
}
