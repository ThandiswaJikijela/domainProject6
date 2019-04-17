package domain.Treatment.Body;

import domain.Treatment.Treatment;

import java.util.Set;

public class BodyTreatment {
    private String name, description, treatmentType;

    protected BodyTreatment(){}

    private BodyTreatment(Builder builder)
    {
        this.name = builder.name;
        this.description = builder.description;
        this.treatmentType = builder.treatmentType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public static class Builder{
        private String name, description, treatmentType;
        private Set<Treatment>Treatment;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder description(String description)
        {
            this.description = description;
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
                "Name ='" +name+ '\'' +
                ", Description='" + description + '\'' +
                ", Treatment Type='" + treatmentType + '\'' +
                '}';
    }
}
