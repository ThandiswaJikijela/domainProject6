package com.thandiswa.repository.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface ManicureRepository extends IRepository<Manicure, String> {
    Set<Manicure> getAll();
}
