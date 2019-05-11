package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.Staff;

import java.util.Map;

public class StaffFactory {
    public static Staff getStaff(Map<String, String> values, String email) {
        return new Staff.Builder()
                .name(values.get("name"))
                .phone(values.get("phone"))
                .address(values.get("address"))
                .email(email)
                .build();
    }
}
