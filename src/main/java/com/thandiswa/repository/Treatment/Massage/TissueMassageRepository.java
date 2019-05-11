package com.thandiswa.repository.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface TissueMassageRepository extends IRepository<TissueMassage, String> {
    Set<TissueMassage> getAll();
}
