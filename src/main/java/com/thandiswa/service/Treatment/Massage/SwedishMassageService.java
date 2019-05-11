package com.thandiswa.service.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.service.IService;

import java.util.Set;

public interface SwedishMassageService extends IService<SwedishMassage, String> {
    Set<SwedishMassage> getAll();
}
