package com.thandiswa.repository.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface AntiAgingFacialRepository extends IRepository<AntAgingFacial, String> {
    Set<AntAgingFacial> getAll();
}
