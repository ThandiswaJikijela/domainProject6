package com.thandiswa.repository.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface BodyScrubRepository extends IRepository<BodyScrub, String> {
    Set<BodyScrub> getAll();
}
