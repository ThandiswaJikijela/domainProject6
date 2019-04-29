package domain.Treatment.Body;

import domain.Treatment.Treatment;

import java.util.Set;

public class BodyTreatment extends Treatment{
    private String treatmentType;

    protected BodyTreatment(){
        super();
    }

    private BodyTreatment(Builder builder)
    {
        this.treatmentType = builder.treatmentType;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public static class Builder{
        private String treatmentType;
        //private Set<Treatment>Treatment;

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
                "Treatment Type ='" + treatmentType + '\'' +
                '}';
    }
}
