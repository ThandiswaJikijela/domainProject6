package factory.Treatment.Facial;

import domain.Treatment.Facial.FacialTreatment;

public class FacialTreatmentFactory {
    public static FacialTreatment getFacialTreatment (String treatmentType) {
        return new FacialTreatment.Builder()
                .treatmentType(treatmentType)
                .build();
    }
}
