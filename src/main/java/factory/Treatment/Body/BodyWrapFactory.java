package factory.Treatment.Body;

import domain.Treatment.Body.BodyWraps;

public class BodyWrapFactory {
    public static BodyWraps getBodyWraps (String wrapMaterials) {
        return new BodyWraps.Builder().wrapMaterials(wrapMaterials)
                .build();
    }
}
