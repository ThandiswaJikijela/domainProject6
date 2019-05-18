package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.util.IDs;

import java.util.Map;

public class BodyTreatmentFactory {
    public static BodyTreatment getBodyTreatment (String treatmentType) {
        return new BodyTreatment.Builder().treatmentID(IDs.generateId())
                .treatmentType(treatmentType)
                .build();
    }
}
