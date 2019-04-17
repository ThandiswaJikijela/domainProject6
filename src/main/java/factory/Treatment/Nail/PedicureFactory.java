package factory.Treatment.Nail;

import domain.Treatment.Nail.Pedicure;

public class PedicureFactory {
    public static Pedicure getPedicure (String mediHeelPedicure) {
        return new Pedicure.Builder().mediHeelPedicure(mediHeelPedicure)
                .build();
    }
}
