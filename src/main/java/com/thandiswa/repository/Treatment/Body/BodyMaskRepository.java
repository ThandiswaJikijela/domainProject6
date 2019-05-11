package com.thandiswa.repository.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface BodyMaskRepository extends IRepository<BodyMask, String> {
    Set<BodyMask> getAll();
}
