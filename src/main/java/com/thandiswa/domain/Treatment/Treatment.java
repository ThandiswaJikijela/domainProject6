package com.thandiswa.domain.Treatment;

import java.util.Objects;

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
        //private Set<com.thandiswa.domain.Spa> Spa;

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


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Treatment treatment = (Treatment) obj;
        return treatmentID.equals(treatment.treatmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentID);
    }
}
