package com.thandiswa.domain.Treatment.Body;

public class BodyScrub extends BodyTreatment {
    private String grittyIngredients;

    private BodyScrub()
    {
        super();
    }

    private BodyScrub(Builder builder){
        this.grittyIngredients = builder.grittyIngredients;
    }

    public String getGrittyIngredients() {
        return grittyIngredients;
    }

    public static class Builder
    {
        private String grittyIngredients;
        //private Set<BodyTreatment>BodyTreatment;

        public Builder grittyIngredients(String grittyIngredients)
        {
            this.grittyIngredients = grittyIngredients;
            return this;
        }

        public BodyScrub build()
        {
            return new BodyScrub(this);
        }
    }
    public String toString(){
        return"BodyScrub{" +
                "Gritty Ingredients ='" +grittyIngredients+
                '}';
    }
}
