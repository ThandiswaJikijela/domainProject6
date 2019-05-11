package com.thandiswa.service.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.service.IService;

import java.util.Set;

public interface AromatherapyService extends IService<Aromatherapy, String> {
    Set<Aromatherapy> getAll();
}
