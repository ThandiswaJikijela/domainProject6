package factory.Treatment.Massage;

import domain.Treatment.Massage.MassageTreatment;

public class MassageTreatmentFactory {
    public static MassageTreatment getMassageTreatment (String massageType) {
        return new MassageTreatment.Builder().massageType(massageType)
                .build();
    }
}
