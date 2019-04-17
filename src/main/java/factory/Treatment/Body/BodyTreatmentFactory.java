package factory.Treatment.Body;

import domain.Treatment.Body.BodyTreatment;

public class BodyTreatmentFactory {
    public static BodyTreatment getBodyTreatment (String description) {
        return new BodyTreatment.Builder().description(description)
                .build();
    }
}
