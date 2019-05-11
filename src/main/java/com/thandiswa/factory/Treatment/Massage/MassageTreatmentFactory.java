package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;

import java.util.Map;

public class MassageTreatmentFactory {
    public static MassageTreatment getMassageTreatment (Map<String, String> values,String massageType) {
        return new MassageTreatment.Builder().massageType(massageType)
                .build();
    }
}
