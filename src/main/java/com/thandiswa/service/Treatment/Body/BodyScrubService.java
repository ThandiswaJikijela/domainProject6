package com.thandiswa.service.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.service.IService;

import java.util.Set;

public interface BodyScrubService extends IService<BodyScrub, String> {
    Set<BodyScrub> getAll();
}
