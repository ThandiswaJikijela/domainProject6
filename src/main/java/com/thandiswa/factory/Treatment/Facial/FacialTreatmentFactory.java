package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;

import java.util.Map;

public class FacialTreatmentFactory {
    public static FacialTreatment getFacialTreatment (Map<String, String> values, String treatmentType) {
        return new FacialTreatment.Builder()
                .treatmentType(treatmentType)
                .skinCareProducts(values.get("skinCareProducts"))
                .build();
    }
}
