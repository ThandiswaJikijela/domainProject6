package com.thandiswa.domain.Treatment.Facial;

public class DeepCleansing extends FacialTreatment{
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
                ", FacialID='" + facialID + '\'' +
                ", Oil Types='" + oilTypes + '\'' +
                '}';
    }
}
