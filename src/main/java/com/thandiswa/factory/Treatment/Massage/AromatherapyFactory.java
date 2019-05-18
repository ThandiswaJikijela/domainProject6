package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;

import java.util.Map;

public class AromatherapyFactory {
    public static Aromatherapy getAromatherapy (String fragrantEssentialOil) {
        return new Aromatherapy.Builder().fragrantEssentialOil(fragrantEssentialOil)
                .build();
    }
}
