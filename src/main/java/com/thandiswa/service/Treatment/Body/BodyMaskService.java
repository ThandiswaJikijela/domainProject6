package com.thandiswa.service.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.service.IService;

import java.util.Set;

public interface BodyMaskService extends IService<BodyMask, String> {
    Set<BodyMask> getAll();
}
