package factory.Treatment.Facial;

import domain.Treatment.Facial.FacialTreatment;

public class FacialTreatmentFactory {
    public static FacialTreatment getFacialTreatment (String name, String treatmentID, String treatmentType) {
        return new FacialTreatment.Builder().name(name)
                .treatmentID(treatmentID)
                .treatmentType(treatmentType)
                .build();
    }
}
