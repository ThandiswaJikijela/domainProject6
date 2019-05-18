package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.util.IDs;

import java.util.Map;

public class StaffFactory {
    public static Staff getStaff(String email, String address) {
        return new Staff.Builder().staffID(IDs.generateId())
                .address(address)
                .email(email)
                .build();
    }
}
