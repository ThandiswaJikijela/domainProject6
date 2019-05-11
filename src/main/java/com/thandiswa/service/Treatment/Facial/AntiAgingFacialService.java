package com.thandiswa.service.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.service.IService;

import java.util.Set;

public interface AntiAgingFacialService extends IService<AntAgingFacial, String> {
    Set<AntAgingFacial> getAll();
}
