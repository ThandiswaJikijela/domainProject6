package com.thandiswa.domain.Treatment.Body;


import com.thandiswa.domain.Treatment.Treatment;

import java.util.Objects;

public class BodyTreatment{
    //private Treatment treatment = new Treatment();
    private String treatmentID, treatmentType;

    protected BodyTreatment(){
        super();
    }

    private BodyTreatment(Builder builder)
    {
        this.treatmentID = builder.treatmentID;
        this.treatmentType = builder.treatmentType;
    }

    public String getTreatmentID() {
        return treatmentID;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public static class Builder{
        private String treatmentID, treatmentType;
        //private Set<Treatment>Treatment;

        public  Builder treatmentID(String treatmentID)
        {
            this.treatmentID = treatmentID;
            return this;
        }

        public Builder treatmentType(String treatmentType)
        {
            this.treatmentType = treatmentType;
            return this;
        }

        public BodyTreatment build(){
            return new BodyTreatment(this);
        }

    }
    public String toString(){
        return"BodyTreatment{" +
                "Treatment ID ='" + treatmentID + '\'' +
                "Treatment Type ='" + treatmentType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        BodyTreatment bodyTreatment = (BodyTreatment) obj;
        return treatmentID.equals(bodyTreatment.treatmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentID);
    }
}
