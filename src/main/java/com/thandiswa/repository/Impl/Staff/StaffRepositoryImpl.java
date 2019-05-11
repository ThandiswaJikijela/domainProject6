package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.repository.Staff.StaffRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        staffMap.put(staff.getName(),staff);
        staffMap.put(staff.getEmail(),staff);
        staffMap.put(staff.getPhone(),staff);
        staffMap.put(staff.getAddress(),staff);
        Staff savedStaff = staffMap.get(toString());
        return savedStaff;
    }

    @Override
    public Staff read(String s) {
        Staff staff = staffMap.get(toString());
        return staff;
    }

    @Override
    public Staff update(Staff staff) {
        staffMap.put(staff.toString(),staff);
        Staff savedStaff = staffMap.get(toString());
        return savedStaff;
    }

    @Override
    public void delete(String s) {
        staffMap.remove(toString());
    }

    @Override
    public Set<Staff> getAll() {
        return (Set<Staff>) staffMap;
    }
}
