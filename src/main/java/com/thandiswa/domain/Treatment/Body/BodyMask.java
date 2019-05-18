package com.thandiswa.domain.Treatment.Body;

import com.thandiswa.domain.Booking.Booking;

import java.util.Objects;

public class BodyMask {
    private BodyTreatment bodyTreatment = new BodyTreatment();
    private String maskIngredients;

    private BodyMask()
    {
        super();
    }

    private BodyMask(Builder builder){
        this.maskIngredients = builder.maskIngredients;
    }

    public String getMaskIngredients() {
        return maskIngredients;
    }

    public static class Builder{
        private String maskIngredients;
        //private Set<BodyTreatment>BodyTreatment;

        public Builder maskIngredients(String maskIngredients)
        {
            this.maskIngredients = maskIngredients;
            return this;
        }

        public BodyMask build()
        {
            return new BodyMask(this);
        }

    }
    public String toString(){
        return"BodyMask{" +
                "='" +bodyTreatment.toString()+
                "maskIngredients='" +maskIngredients+
                '}';
    }

   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        BodyMask bodyMask = (BodyMask) obj;
        return bodyTreatment.equals(bodyMask.bodyTreatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID);
    }

    */
}
