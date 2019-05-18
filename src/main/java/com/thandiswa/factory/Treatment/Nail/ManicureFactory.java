package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;

import java.util.Map;

public class ManicureFactory {
    public static Manicure getManicure (String nailStyle) {
        return new Manicure.Builder().nailStyle(nailStyle)
                .build();
    }
}
