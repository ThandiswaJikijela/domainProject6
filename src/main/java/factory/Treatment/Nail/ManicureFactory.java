package factory.Treatment.Nail;

import domain.Treatment.Nail.Manicure;

public class ManicureFactory {
    public static Manicure getManicure (String nailStyle) {
        return new Manicure.Builder().nailStyle(nailStyle)
                .build();
    }
}
