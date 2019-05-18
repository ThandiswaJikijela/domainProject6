package com.thandiswa.domain.Treatment.Massage;

import com.thandiswa.domain.Treatment.Treatment;

import java.util.Objects;

public class MassageTreatment {
    //private Treatment treatment = new Treatment();
    private String treatmentID, massageType;

    protected MassageTreatment(){
        super();
    }

    private MassageTreatment(Builder builder)
    {
        this.treatmentID = builder.treatmentID;
        this.massageType = builder.massageType;
    }


    public String getTreatmentID() {
        return treatmentID;
    }

    public String getMassageType() {
        return massageType;
    }

    public static class Builder{
        private String treatmentID, massageType;
        //private Set<Treatment>Treatment;


        public Builder treatmentID(String treatmentID)
        {
            this.treatmentID = treatmentID;
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
                "Treatment ID ='" + treatmentID + '\'' +
                "Massage Type ='" + massageType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        MassageTreatment massageTreatment = (MassageTreatment) obj;
        return treatmentID.equals(massageTreatment.treatmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentID);
    }
}
