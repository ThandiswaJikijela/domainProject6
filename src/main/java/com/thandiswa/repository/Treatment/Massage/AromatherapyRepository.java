package com.thandiswa.repository.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface AromatherapyRepository extends IRepository<Aromatherapy, String> {
    Set<Aromatherapy> getAll();
}
