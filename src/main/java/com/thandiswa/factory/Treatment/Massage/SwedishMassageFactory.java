package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;

import java.util.Map;

public class SwedishMassageFactory {
    public static SwedishMassage getSwedishMassage (String carrierOil) {
        return new SwedishMassage.Builder().carrierOil(carrierOil)
                .build();
    }
}
