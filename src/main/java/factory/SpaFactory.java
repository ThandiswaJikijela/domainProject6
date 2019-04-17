package factory;

import domain.Spa;

public class SpaFactory {
    public static Spa getSpa(String spaName,String address) {
        return new Spa.Builder().spaName(spaName)
                .address(address)
                .build();
    }
}
