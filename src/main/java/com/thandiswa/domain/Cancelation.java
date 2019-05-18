package com.thandiswa.domain;

import java.util.Date;
import java.util.Objects;

public class Cancelation {
    private Date bookedDate;
    private String reservationID, paymentMethod;

    private Cancelation(){}

    private Cancelation(Builder builder)
    {
        this.reservationID = builder.reservationID;
        this.bookedDate = builder.bookedDate;
        this.paymentMethod = builder.paymentMethod;
    }

    public String getReservationID() {
        return reservationID;
    }

    public Date getBookedDate() {
        return bookedDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public static class Builder{
        private Date bookedDate;
        private String reservationID, paymentMethod;

        public Builder reservationID(String reservationID)
        {
            this.reservationID = reservationID;
            return this;
        }

        public Builder bookedDate(Date bookedDate)
        {
            this.bookedDate = bookedDate;
            return this;
        }

        public Builder paymentMethod(String paymentMethod)
        {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Cancelation build(){
            return new Cancelation(this);
        }
    }

    public String toString(){
        return"Cancelation{" +
                " reservationID ='" + reservationID+ '\'' +
                " bookedDate ='" + bookedDate+ '\'' +
                ", paymentMethod ='" + paymentMethod+ '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Cancelation cancelation = (Cancelation) obj;
        return reservationID.equals(cancelation.reservationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID);
    }
}
