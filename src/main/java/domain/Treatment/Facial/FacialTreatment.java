package domain.Treatment.Facial;


import domain.Treatment.Treatment;

import java.util.Set;

public class FacialTreatment {
    private String name, treatmentID, skinCareProducts;
    private String treatmentType;


    protected FacialTreatment(){}

    private FacialTreatment(Builder builder)
    {
        this.name = builder.name;
        this.treatmentID = builder.treatmentID;
        this.treatmentType = builder.treatmentType;
    }

    public String getName() {
        return name;
    }

    public String getTreatmentID() {
        return treatmentID;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public static class Builder {
        private String name, treatmentID, decription, treatmentType, skinCareProducts;
        private Set<domain.Treatment.Treatment> Treatment;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder treatmentID(String treatmentID) {
            this.treatmentID = treatmentID;
            return this;
        }

        public Builder treatmentType(String treatmentType) {
            this.treatmentType = treatmentType;
            return this;
        }

        public FacialTreatment build() {
            return new FacialTreatment(this);
        }

    }
        public String toString(){
            return"FacialTreatment{" +
                    "Name ='" +name+ '\'' +
                    ", Treatment ID='" + treatmentID + '\'' +
                    ", Treatment Type='" + treatmentType + '\'' +
                    '}';
        }
}
