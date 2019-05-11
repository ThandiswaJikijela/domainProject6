package com.thandiswa.domain.Treatment.Massage;

import com.thandiswa.domain.Treatment.Treatment;

public class MassageTreatment extends Treatment{
    private String massageType;

    protected MassageTreatment(){
        super();
    }

    private MassageTreatment(Builder builder)
    {
        this.massageType = builder.massageType;
    }


    public String getMassageType() {
        return massageType;
    }

    public static class Builder{
        private String massageType;
        //private Set<Treatment>Treatment;


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
                "Massage Type ='" + massageType + '\'' +
                '}';
    }
}
