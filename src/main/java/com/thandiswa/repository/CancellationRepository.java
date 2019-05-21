package com.thandiswa.repository;

import com.thandiswa.domain.Cancellation;

import java.util.Set;

public interface CancellationRepository extends IRepository<Cancellation, String>{
    Set<Cancellation> getAll();
}
