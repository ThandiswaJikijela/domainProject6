package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;

import java.util.Map;

public class BodyTreatmentFactory {
    public static BodyTreatment getBodyTreatment (Map<String, String> values, String treatmentType) {
        return new BodyTreatment.Builder().treatmentType(treatmentType)
                .build();
    }
}
