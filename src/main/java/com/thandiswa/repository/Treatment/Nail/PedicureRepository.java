package com.thandiswa.repository.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface PedicureRepository extends IRepository<Pedicure, String> {
    Set<Pedicure> getAll();
}
