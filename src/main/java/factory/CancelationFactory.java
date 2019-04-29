package factory;

import domain.Cancelation;

import java.util.Date;
import java.util.Map;

public class CancelationFactory {
    public static Cancelation getCancelation (Map<String, String> values, String paymentMethod) {
        return new Cancelation.Builder()
                .paymentMethod(paymentMethod)
                .build();
    }
}
