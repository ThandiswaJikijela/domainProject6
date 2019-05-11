package com.thandiswa.service.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.service.IService;

import java.util.Set;

public interface SpaAdminService extends IService<SpaAdmin, String> {
    Set<SpaAdmin> getAll();
}
