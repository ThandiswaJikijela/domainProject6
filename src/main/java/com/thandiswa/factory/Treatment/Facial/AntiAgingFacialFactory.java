package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;

import java.util.Map;

public class AntiAgingFacialFactory {
    public static AntAgingFacial getAntAgingFacial (String poreIngredients) {
        return new AntAgingFacial.Builder().poreIngredients(poreIngredients)
                .build();
    }
}
