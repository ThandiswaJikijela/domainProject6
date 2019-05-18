package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.util.IDs;

import java.util.Map;

public class SpaAdminFactory {
    public static SpaAdmin getSpaAdmin(String password) {
        return new SpaAdmin.Builder().adminID(IDs.generateId())
                .password(password)
                .build();
    }
}
