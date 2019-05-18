package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.util.IDs;

import java.util.Map;

public class MassageTreatmentFactory {
    public static MassageTreatment getMassageTreatment (String massageType) {
        return new MassageTreatment.Builder().treatmentID(IDs.generateId())
                .massageType(massageType)
                .build();
    }
}
