package com.thandiswa.repository.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface SpaAdminRepository extends IRepository<SpaAdmin, String> {
    Set<SpaAdmin> getAll();
}
