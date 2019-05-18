package com.thandiswa.domain.Treatment.Body;

import java.util.Objects;

public class BodyScrub {
    private BodyTreatment bodyTreatment = new BodyTreatment();
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
                "Treatment ID ='" +bodyTreatment.getTreatmentID()+
                "Gritty Ingredients ='" +grittyIngredients+
                '}';
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        BodyScrub booking = (BodyScrub) obj;
        return reservationID.equals(booking.reservationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID);
    }

     */
}
