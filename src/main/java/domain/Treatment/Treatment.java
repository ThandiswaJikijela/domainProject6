package domain.Treatment;

import domain.Spa;

import java.util.Set;

public class Treatment {
    private String name, treatmentID, description;

    protected Treatment(){}

    private Treatment(Builder builder)
    {
        this.name = builder.name;
        this.treatmentID = builder.treatmentID;
        this.description = builder.description;
    }

    public String getName() {
        return name;
    }

    public String getTreatmentID() {
        return treatmentID;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{
        private String name, treatmentID, description;
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

        public Builder description(String description)
        {
            this.description = description;
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
                    "Description = '" + description + '\'' +
                    '}';
        }
}
