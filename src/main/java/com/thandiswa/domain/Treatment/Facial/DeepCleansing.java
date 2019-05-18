package com.thandiswa.domain.Treatment.Facial;

import java.util.Objects;

public class DeepCleansing {
    private FacialTreatment facialTreatment = new FacialTreatment();
    private String facialID, treatmentType, exfoliates, nourishments, oilTypes;

    private DeepCleansing()
    {
        super();
    }

    private DeepCleansing(Builder builder)
    {
        this.facialID = builder.facialID;
        this.oilTypes = builder.oilTypes;
    }


    public String getFacialID() {
        return facialID;
    }

    public String getOilTypes() {
        return oilTypes;
    }

    public static class Builder
    {
        private String facialID, treatmentType, exfoliates, nourishments, oilTypes;

        public Builder facialID(String facialID)
        {
            this.facialID = facialID;
            return this;
        }

        public Builder oilTypes(String oilTypes)
        {
            this.oilTypes = oilTypes;
            return this;
        }

        public DeepCleansing build(){return new DeepCleansing(this);}
    }

    public String toString() {
        return "DeepCleansing{" +
                ", ='" + facialTreatment.getTreatmentID()+ '\'' +
                ", FacialID='" + facialID + '\'' +
                ", Oil Types='" + oilTypes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        DeepCleansing deepCleansing = (DeepCleansing) obj;
        return facialID.equals(deepCleansing.facialID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facialID);
    }

}
