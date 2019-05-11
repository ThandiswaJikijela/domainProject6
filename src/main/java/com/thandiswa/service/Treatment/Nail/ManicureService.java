package com.thandiswa.service.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.service.IService;

import java.util.Set;

public interface ManicureService extends IService<Manicure, String> {
    Set<Manicure> getAll();
}
