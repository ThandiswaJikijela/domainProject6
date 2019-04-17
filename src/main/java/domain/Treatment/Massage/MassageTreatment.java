package domain.Treatment.Massage;

import domain.Treatment.Treatment;

import java.util.Set;

public class MassageTreatment{
    private String name, treatmentID, description, massageType;

    protected MassageTreatment(){}

    private MassageTreatment(Builder builder)
    {
        this.name = builder.name;
        this.massageType = builder.massageType;
    }

    public String getName() {
        return name;
    }

    public String getMassageType() {
        return massageType;
    }

    public static class Builder{
        private String name, treatmentID, description, massageType;
        private Set<Treatment>Treatment;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder massageType(String massageType)
        {
            this.massageType = massageType;
            return this;
        }

        public MassageTreatment build()
        {
            return new MassageTreatment(this);
        }
    }

    public String toString(){
        return"MassageTreatment{" +
                "Name ='" +name+ '\'' +
                ", Massage Type='" + massageType + '\'' +
                '}';
    }
}
