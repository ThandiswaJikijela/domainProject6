package com.thandiswa.repository.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface DeepCleansingRepository extends IRepository<DeepCleansing, String> {
    Set<DeepCleansing> getAll();
}
