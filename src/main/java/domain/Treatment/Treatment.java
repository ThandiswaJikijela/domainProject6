package domain.Treatment;

import domain.Spa;

import java.util.Set;

public class Treatment {
    private String name, treatmentID, decription;

    private Treatment(){}

    private Treatment(Builder builder)
    {
        this.name = builder.name;
        this.treatmentID = builder.treatmentID;
    }

    public String getName() {
        return name;
    }

    public String getTreatmentID() {
        return treatmentID;
    }

    public static class Builder{
        private String name, treatmentID, decription;
        private Set<domain.Spa> Spa;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder treatmentID(String treatmentID)
        {
            this.treatmentID = treatmentID;
            return this;
        }

        public Treatment build(){
            return new Treatment(this);
        }

    }
        public String toString(){
            return"Treatment{" +
                    "Name ='" +name+ '\'' +
                    ", Treatment ID='" + treatmentID + '\'' +
                    '}';
        }
}
