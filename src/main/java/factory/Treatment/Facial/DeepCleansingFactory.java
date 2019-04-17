package factory.Treatment.Facial;

import domain.Treatment.Facial.DeepCleansing;

public class DeepCleansingFactory {
    public static DeepCleansing getDeepCleansing (String oilTypes) {
        return new DeepCleansing.Builder().oilTypes(oilTypes)
                .build();
    }
}
