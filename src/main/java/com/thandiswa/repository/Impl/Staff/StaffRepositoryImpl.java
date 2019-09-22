package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.repository.Staff.StaffRepository;

import java.util.*;

public class StaffRepositoryImpl implements StaffRepository {

    private static StaffRepository staffRepository;

    private Set<Staff> staffSet;

    private StaffRepositoryImpl() {
        this.staffSet = new HashSet<>();
    }

    public static StaffRepository getStaffRepository(){
        if (staffRepository == null) staffRepository = new StaffRepositoryImpl();
        return staffRepository;
    }

    @Override
    public Staff create(Staff staff) {
        this.staffSet.add(staff);
        return staff;
    }

    @Override
    public Staff read(String s) {
        return this.staffSet.stream()
                .filter(staff -> staff.getName().equalsIgnoreCase(s))
                .findAny()
                .orElse(null);
    }

    @Override
    public Staff update(Staff staff) {
        Staff staff1 = read(staff.getEmail());
        if (staff1 != null) {
            delete(staff1.getEmail());
            return create(staff);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Staff staff = read(s);
        this.staffSet.remove(staff);
    }

    @Override
    public Staff retrieveByDesc(String email) {
        return this.staffSet.stream()
                .filter(staff -> staff.getEmail().equalsIgnoreCase(email))
                .findAny().orElse(null);
    }

    @Override
    public Set<Staff> getAll() {
        return this.staffSet;
    }
}
