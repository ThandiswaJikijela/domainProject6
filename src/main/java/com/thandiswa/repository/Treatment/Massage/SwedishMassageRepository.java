package com.thandiswa.repository.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface SwedishMassageRepository extends IRepository<SwedishMassage, String> {
    Set<SwedishMassage> getAll();
}
