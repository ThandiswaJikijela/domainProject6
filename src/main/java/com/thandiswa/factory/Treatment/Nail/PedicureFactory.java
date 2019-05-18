package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;

import java.util.Map;

public class PedicureFactory {
    public static Pedicure getPedicure (String mediHeelPedicure) {
        return new Pedicure.Builder().mediHeelPedicure(mediHeelPedicure)
                .build();
    }
}
