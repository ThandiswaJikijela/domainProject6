package factory.Treatment.Nail;

import domain.Treatment.Nail.NailTreatment;

public class NailTreatmentFactory {
    public static NailTreatment getNailTreatment (String nailType) {
        return new NailTreatment.Builder().nailType(nailType)
                .build();
    }
}
