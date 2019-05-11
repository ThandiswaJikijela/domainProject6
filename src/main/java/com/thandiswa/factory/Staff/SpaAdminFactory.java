package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;

public class SpaAdminFactory {
    public static SpaAdmin getSpaAdmin(String adminID, String password) {
        return new SpaAdmin.Builder().adminID(adminID)
                .password(password)
                .build();
    }
}
