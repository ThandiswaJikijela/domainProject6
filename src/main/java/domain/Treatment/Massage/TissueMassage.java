package domain.Treatment.Massage;

import java.util.Set;

public class TissueMassage extends MassageTreatment{
    private String massagePressure;

    private TissueMassage()
    {
        super();
    }

    private TissueMassage(Builder builder)
    {
        this.massagePressure= builder.massagePressure;
    }

    public String getMassagePressure() {
        return massagePressure;
    }

    public static class Builder{
        private String massagePressure;
        private Set<MassageTreatment> MassageTreatment;

        public Builder massagePressure(String massagePressure)
        {
            this.massagePressure = massagePressure;
            return this;
        }

        public TissueMassage build()
        {
            return new TissueMassage(this);
        }
    }
    public String toString(){
        return"TissueMassage{" +
                "Massage Pressure ='" +massagePressure+
                '}';
    }
}
