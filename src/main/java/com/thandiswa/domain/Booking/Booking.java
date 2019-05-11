package com.thandiswa.domain.Booking;

public class Booking {
    private String reservationID, treatmentType;
    private double totalPrice;

    private Booking(){}

    private Booking (Builder builder){
        this.reservationID = builder.reservationID;
        this.treatmentType = builder.treatmentType;
        this.totalPrice = builder.totalPrice;
    }

    public String getReservationID() {
        return reservationID;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static class Builder{
        private String reservationID, treatmentType;
        private double totalPrice;

        public Builder reservationID(String reservationID)
        {
            this.reservationID = reservationID;
            return this;
        }

        public Builder treatmentType(String treatmentType)
        {
            this.treatmentType = treatmentType;
            return this;
        }

        public Builder totalPrice(double totalPrice)
        {
            this.totalPrice = totalPrice;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }

    public String toString(){
        return"Booking{" +
                "ReservationID'" +reservationID+ '\'' +
                ", TreatmentType='" + treatmentType + '\'' +
                ", TotalPrice'" + totalPrice + '\'' +
                '}';
    }
}
