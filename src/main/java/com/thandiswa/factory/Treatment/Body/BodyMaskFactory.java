package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;

public class BodyMaskFactory {
    public static BodyMask getBodyMask (String maskIngredients) {
        return new BodyMask.Builder().maskIngredients(maskIngredients)
                .build();
    }
}
