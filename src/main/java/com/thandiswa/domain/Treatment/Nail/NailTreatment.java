package com.thandiswa.domain.Treatment.Nail;

import com.thandiswa.domain.Treatment.Treatment;

import java.util.Objects;

public class NailTreatment {
    //private Treatment treatment = new Treatment();
    private String treatmentID, nailType, nailShape;
    private int nailSize;

    protected NailTreatment(){
        super();
    }

    private NailTreatment(Builder builder)
    {
        this.treatmentID = builder.treatmentID;
        this.nailShape = builder.nailShape;
        this.nailSize = builder.nailSize;
        this.nailType = builder.nailType;
    }

    public String getTreatmentID() {
        return treatmentID;
    }

    public String getNailShape() {
        return nailShape;
    }

    public String getNailType() {
        return nailType;
    }

    public int getNailSize() {
        return nailSize;
    }

    public static class Builder {
        private String treatmentID, nailType, nailShape;
        private int nailSize;
        //private Set<Treatment>Treatment;

        public Builder treatmentID(String treatmentID)
        {
            this.treatmentID = treatmentID;
            return this;
        }
        public Builder nailType(String nailType)
        {
            this.nailType = nailType;
            return this;
        }

        public Builder nailShape(String nailShape)
        {
            this.nailShape = nailShape;
            return this;
        }

        public Builder nailSize(int nailSize)
        {
            this.nailSize = nailSize;
            return this;
        }

        public NailTreatment build(){
            return new NailTreatment(this);
        }
    }


    public String toString(){
        return"NailTreatment{" +
                "Treatment ID ='"+treatmentID+ '\'' +
                "Nail Type ='" +nailType+ '\'' +
                ", Nail Shape='" + nailShape + '\'' +
                ", Nail Size='" + nailSize + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        NailTreatment nailTreatment = (NailTreatment) obj;
        return treatmentID.equals(nailTreatment.treatmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatmentID);
    }
}
