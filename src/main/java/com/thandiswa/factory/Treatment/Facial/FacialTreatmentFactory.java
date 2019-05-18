package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.util.IDs;

import java.util.Map;

public class FacialTreatmentFactory {
    public static FacialTreatment getFacialTreatment (String treatmentType, String skinCareProducts) {
        return new FacialTreatment.Builder().treatmentID(IDs.generateId())
                .treatmentType(treatmentType)
                .skinCareProducts(skinCareProducts)
                .build();
    }
}
