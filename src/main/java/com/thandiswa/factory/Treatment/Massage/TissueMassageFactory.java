package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;

import java.util.Map;

public class TissueMassageFactory {
    public static TissueMassage getTissueMassage (String massagePressure) {
        return new TissueMassage.Builder().massagePressure(massagePressure)
                .build();
    }
}
