package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.util.IDs;

import java.util.Map;

public class DeepCleansingFactory {
    public static DeepCleansing getDeepCleansing (String oilTypes) {
        return new DeepCleansing.Builder().facialID(IDs.generateId())
                .oilTypes(oilTypes)
                .build();
    }
}
