package com.thandiswa.service.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.service.IService;

import java.util.Set;

public interface BodyWrapsService extends IService<BodyWraps, String> {
    Set<BodyWraps> getAll();
}
