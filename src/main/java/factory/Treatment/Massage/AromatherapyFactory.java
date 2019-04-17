package factory.Treatment.Massage;

import domain.Treatment.Massage.Aromatherapy;

public class AromatherapyFactory {
    public static Aromatherapy getAromatherapy (String fragrantEssentialOil) {
        return new Aromatherapy.Builder().fragrantEssentialOil(fragrantEssentialOil)
                .build();
    }
}
