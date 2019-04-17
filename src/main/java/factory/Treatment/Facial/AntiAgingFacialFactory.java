package factory.Treatment.Facial;

import domain.Treatment.Facial.AntAgingFacial;

public class AntiAgingFacialFactory {
    public static AntAgingFacial getAntAgingFacial (String poreIngredients) {
        return new AntAgingFacial.Builder().poreIngredients(poreIngredients)
                .build();
    }
}
