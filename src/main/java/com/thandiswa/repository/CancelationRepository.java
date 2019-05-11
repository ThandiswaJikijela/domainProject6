package com.thandiswa.repository;

import com.thandiswa.domain.Cancelation;

import java.util.Set;

public interface CancelationRepository extends IRepository<Cancelation, String>{
    Set<Cancelation> getAll();
}
