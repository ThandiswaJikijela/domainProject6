package com.thandiswa.domain.Treatment.Nail;

import com.thandiswa.domain.Treatment.Treatment;

public class NailTreatment extends Treatment{
    private String nailType, nailShape;
    private int nailSize;

    protected NailTreatment(){
        super();
    }

    private NailTreatment(Builder builder)
    {
        this.nailShape = builder.nailShape;
        this.nailSize = builder.nailSize;
        this.nailType = builder.nailType;
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
        private String nailType, nailShape;
        private int nailSize;
        //private Set<Treatment>Treatment;

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
                "Nail Type ='" +nailType+ '\'' +
                ", Nail Shape='" + nailShape + '\'' +
                ", Nail Size='" + nailSize + '\'' +
                '}';
    }
}
