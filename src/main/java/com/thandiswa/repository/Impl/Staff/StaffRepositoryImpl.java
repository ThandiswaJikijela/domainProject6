package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.repository.Staff.StaffRepository;

import java.util.*;

public class StaffRepositoryImpl implements StaffRepository {

    private static StaffRepositoryImpl repository = null;
    private Map<String, Staff> staffMap;

    private StaffRepositoryImpl(){
        this.staffMap = new HashMap<String, Staff>();
    }

    public static StaffRepositoryImpl getRepository()
    {
        if (repository == null) repository = new StaffRepositoryImpl();
        return repository;
    }

    @Override
    public Staff create(Staff staff) {
        this.staffMap.put(staff.toString(),staff);
        return staff;
    }

    @Override
    public Staff read(String s) {
        Staff staff = staffMap.get(toString());
        return staff;
    }

    @Override
    public Staff update(Staff staff) {
        this.staffMap.replace(staff.toString(),staff);
        return this.staffMap.get(staff.toString());
    }

    @Override
    public void delete(String s) {
        staffMap.remove(toString());
    }

    @Override
    public Set<Staff> getAll() {
        Collection<Staff> staffCollection = this.staffMap.values();
        Set<Staff> set = new HashSet<>();
        set.addAll(staffCollection);
        return set;
    }
}
