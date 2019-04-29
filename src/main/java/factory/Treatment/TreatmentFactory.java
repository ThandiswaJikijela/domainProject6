package factory.Treatment;

import domain.Treatment.Treatment;

import java.util.Map;

public class TreatmentFactory {
    public static Treatment getTreatment (Map<String, String> values,String treatmentID) {
        return new Treatment.Builder().name(values.get("name"))
                .description(values.get("description"))
                .treatmentID(treatmentID)
                .build();
    }
}
