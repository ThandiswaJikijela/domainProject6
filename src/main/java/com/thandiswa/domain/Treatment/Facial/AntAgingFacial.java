package com.thandiswa.domain.Treatment.Facial;

public class AntAgingFacial extends FacialTreatment{
    private String poreIngredients;

    private AntAgingFacial(){
        super();
    }

    private AntAgingFacial(Builder builder)
    {
        this.poreIngredients = builder.poreIngredients;
    }

    public String getPoreIngredients() {
        return poreIngredients;
    }

    public static class Builder{
        private String poreIngredients;
        //private Set<FacialTreatment> FacialTreatment;

        public Builder poreIngredients(String poreIngredients)
        {
            this.poreIngredients = poreIngredients;
            return this;
        }

        public AntAgingFacial build()
        {
            return new AntAgingFacial(this);
        }
    }
    public String toString(){
        return"AntiAgingFacial{" +
                "Pore Ingredients ='" +poreIngredients+
                '}';
    }
}
