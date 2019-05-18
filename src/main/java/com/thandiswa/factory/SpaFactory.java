package com.thandiswa.factory;

import com.thandiswa.domain.Spa;
import com.thandiswa.util.IDs;

import java.util.Map;

public class SpaFactory {
    public static Spa getSpa(String address, String spaName) {
        return new Spa.Builder().spaId(IDs.generateId())
                .spaName(spaName)
                .address(address)
                .build();
    }
}
