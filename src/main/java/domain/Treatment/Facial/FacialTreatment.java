package domain.Treatment.Facial;


import domain.Treatment.Treatment;

import java.util.Set;

public class FacialTreatment extends Treatment{

    private String treatmentType, skinCareProducts;


    protected FacialTreatment(){
        super();
    }

    private FacialTreatment(Builder builder)
    {
        this.treatmentType = builder.treatmentType;
        this.skinCareProducts = builder.skinCareProducts;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public String getSkinCareProducts() {
        return skinCareProducts;
    }

    public static class Builder {
        private String treatmentType, skinCareProducts;
        private Set<domain.Treatment.Treatment> Treatment;

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
                    "Treatment Type ='" + treatmentType + '\'' +
                    "Skin Care Products = '"+ skinCareProducts + '\''+
                    '}';
        }
}
