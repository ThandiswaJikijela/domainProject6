package com.thandiswa.service.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.service.IService;

import java.util.Set;

public interface StaffService extends IService<Staff, String> {
    Staff retrieveByDesc(String staffDesc);
    Set<Staff> getAll();
}
