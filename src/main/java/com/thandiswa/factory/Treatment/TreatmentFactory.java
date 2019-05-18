package com.thandiswa.factory.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.util.IDs;

import java.util.Map;

public class TreatmentFactory {
    public static Treatment getTreatment (String description, String name) {
        return new Treatment.Builder().name(name)
                .description(description)
                .treatmentID(IDs.generateId())
                .build();
    }
}
