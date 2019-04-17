package factory.Treatment;

import domain.Treatment.Treatment;

public class TreatmentFactory {
    public static Treatment getTreatment (String name, String treatmentID) {
        return new Treatment.Builder().name(name)
                .treatmentID(treatmentID)
                .build();
    }
}
