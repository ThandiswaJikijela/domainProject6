package factory.Treatment.Massage;

import domain.Treatment.Massage.TissueMassage;

public class TissueMassageFactory {
    public static TissueMassage getTissueMassage (String massagePressure) {
        return new TissueMassage.Builder().massagePressure(massagePressure)
                .build();
    }
}
