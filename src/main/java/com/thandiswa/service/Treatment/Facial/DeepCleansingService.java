package com.thandiswa.service.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.service.IService;

import java.util.Set;

public interface DeepCleansingService extends IService<DeepCleansing, String> {
    Set<DeepCleansing> getAll();
}
