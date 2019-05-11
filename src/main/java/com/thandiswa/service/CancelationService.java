package com.thandiswa.service;

import com.thandiswa.domain.Cancelation;

import java.util.Set;

public interface CancelationService extends IService<Cancelation, String> {
    Set<Cancelation> getAll();
}
