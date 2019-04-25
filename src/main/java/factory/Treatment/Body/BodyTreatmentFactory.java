package factory.Treatment.Body;

import domain.Treatment.Body.BodyTreatment;

public class BodyTreatmentFactory {
    public static BodyTreatment getBodyTreatment (String treatmentType) {
        return new BodyTreatment.Builder().treatmentType(treatmentType)
                .build();
    }
}
