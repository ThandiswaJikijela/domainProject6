package com.thandiswa.repository.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface BodyWrapsRepository extends IRepository<BodyWraps, String> {
    Set<BodyWraps> getAll();
}
