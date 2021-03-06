package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;

import java.util.Map;

public class BodyWrapFactory {
    public static BodyWraps getBodyWraps (String wrapMaterials) {
        return new BodyWraps.Builder().wrapMaterials(wrapMaterials)
                .build();
    }
}
