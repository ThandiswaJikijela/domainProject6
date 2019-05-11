package com.thandiswa.service.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.service.IService;

import java.util.Set;

public interface MassageTreatmentService extends IService<MassageTreatment, String> {
    Set<MassageTreatment> getAll();
}
