package com.thandiswa.domain.Treatment.Facial;


import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.domain.Treatment.Treatment;

import java.util.Objects;
import java.util.Set;

public class FacialTreatment {

    //private Treatment treatment = new Treatment();
    private String treatmentID, treatmentType, skinCareProducts;


    protected FacialTreatment(){
        super();
    }

    private FacialTreatment(Builder builder)
    {
        this.treatmentID = builder.treatmentID;
        this.treatmentType = builder.treatmentType;
        this.skinCareProducts = builder.skinCareProducts;
    }

    public String getTreatmentID() {
        return treatmentID;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public String getSkinCareProducts() {
        return skinCareProducts;
    }

    public static class Builder {
        private String treatmentID, treatmentType, skinCareProducts;
        //private Set<com.thandiswa.domain.Treatment.Treatment> Treatment;

        public Builder treatmentID(String treatmentID) {
            this.treatmentID = treatmentID;
            return this;
        }

        public Builder treatmentType(String treatmentType) {
            this.treatmentType = treatmentType;
            return this;
        }

        public Builder skinCareProducts(String skinCareProducts)
        {
            this.skinCareProducts = skinCareProducts;
            return this;
        }

        public FacialTreatment build() {
            return new FacialTreatment(this);
        }

    }
        public String toString(){
            return"FacialTreatment{" +
                    "Treatment ID ='" + treatmentID + '\'' +
                    "Treatment Type ='" + treatmentType + '\'' +
                    "Skin Care Products = '"+ skinCareProducts + '\''+
                    '}';
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        FacialTreatment facialTreatment = (FacialTreatment) obj;
        return treatmentID.equals(facialTreatment.treatmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentID);
    }
}
