package factory.Treatment.Massage;

import domain.Treatment.Massage.SwedishMassage;

public class SwedishMassageFactory {
    public static SwedishMassage getSwedishMassage (String carrierOil) {
        return new SwedishMassage.Builder().carrierOil(carrierOil)
                .build();
    }
}
