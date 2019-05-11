package com.thandiswa.service.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.service.IService;

import java.util.Set;

public interface PedicureService extends IService<Pedicure, String> {
    Set<Pedicure> getAll();
}
