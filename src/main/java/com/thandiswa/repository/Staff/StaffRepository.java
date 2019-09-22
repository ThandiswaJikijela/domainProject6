package com.thandiswa.repository.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface StaffRepository extends IRepository<Staff, String> {
    Staff retrieveByDesc(String staffDesc);
    Set<Staff> getAll();
}
