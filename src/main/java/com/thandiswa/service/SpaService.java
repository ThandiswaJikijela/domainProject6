package com.thandiswa.service;

import com.thandiswa.domain.Spa;

import java.util.Set;

public interface SpaService extends IService<Spa, String> {
    Set<Spa> getAll();
}
