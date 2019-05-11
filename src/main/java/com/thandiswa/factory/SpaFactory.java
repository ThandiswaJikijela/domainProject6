package com.thandiswa.factory;

import com.thandiswa.domain.Spa;

import java.util.Map;

public class SpaFactory {
    public static Spa getSpa(Map<String, String> values, String spaName) {
        return new Spa.Builder().spaName(spaName)
                .address(values.get("address"))
                .build();
    }
}
