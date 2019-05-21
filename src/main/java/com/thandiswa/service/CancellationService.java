package com.thandiswa.service;

import com.thandiswa.domain.Cancellation;

import java.util.Set;

public interface CancellationService extends IService<Cancellation, String> {
    Set<Cancellation> getAll();
}
