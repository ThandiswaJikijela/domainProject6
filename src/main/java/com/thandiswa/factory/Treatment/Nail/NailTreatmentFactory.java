package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.util.IDs;

import java.util.Map;

public class NailTreatmentFactory {
    public static NailTreatment getNailTreatment (String nailType, String nailShape) {
        return new NailTreatment.Builder().treatmentID(IDs.generateId())
                .nailType(nailType)
                .nailShape(nailShape)
                .build();
    }
}
