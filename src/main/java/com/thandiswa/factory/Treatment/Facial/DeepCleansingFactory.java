package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;

public class DeepCleansingFactory {
    public static DeepCleansing getDeepCleansing (String oilTypes) {
        return new DeepCleansing.Builder().oilTypes(oilTypes)
                .build();
    }
}
