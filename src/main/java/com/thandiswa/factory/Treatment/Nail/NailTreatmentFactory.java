package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;

import java.util.Map;

public class NailTreatmentFactory {
    public static NailTreatment getNailTreatment (Map<String, String> values, String nailType) {
        return new NailTreatment.Builder().nailType(nailType)
                .nailShape(values.get("nailShape"))
                .nailSize(values.size())
                .build();
    }
}
