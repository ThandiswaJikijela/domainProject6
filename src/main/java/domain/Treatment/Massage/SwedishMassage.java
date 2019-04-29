package domain.Treatment.Massage;

import java.util.Set;

public class SwedishMassage extends MassageTreatment{
    private String carrierOil;

    private SwedishMassage()
    {
        super();
    }

    private SwedishMassage(Builder builder)
    {
        this.carrierOil = builder.carrierOil;
    }

    public String getCarrierOil() {
        return carrierOil;
    }

    public static class Builder{
        private String carrierOil;
        //private Set<MassageTreatment> MassageTreatment;

        public Builder carrierOil(String carrierOil)
        {
            this.carrierOil = carrierOil;
            return this;
        }

        public SwedishMassage build()
        {
            return new SwedishMassage(this);
        }
    }
    public String toString(){
        return"SwedishMassage{" +
                "Carrier Oils ='" +carrierOil+
                '}';
    }
}
