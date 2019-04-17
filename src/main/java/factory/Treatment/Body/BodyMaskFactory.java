package factory.Treatment.Body;

import domain.Treatment.Body.BodyMask;

public class BodyMaskFactory {
    public static BodyMask getBodyMask (String maskIngredients) {
        return new BodyMask.Builder().maskIngredients(maskIngredients)
                .build();
    }
}
