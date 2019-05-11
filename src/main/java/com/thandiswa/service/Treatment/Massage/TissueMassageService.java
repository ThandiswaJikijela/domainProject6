package com.thandiswa.service.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.service.IService;

import java.util.Set;

public interface TissueMassageService extends IService<TissueMassage, String> {
    Set<TissueMassage> getAll();
}
