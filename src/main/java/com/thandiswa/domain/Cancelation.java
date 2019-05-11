package com.thandiswa.domain;

import java.util.Date;

public class Cancelation {
    private Date bookedDate;
    private String paymentMethod;

    private Cancelation(){}

    private Cancelation(Builder builder)
    {
        this.bookedDate = builder.bookedDate;
        this.paymentMethod = builder.paymentMethod;
    }

    public Date getBookedDate() {
        return bookedDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public static class Builder{
        private Date bookedDate;
        private String paymentMethod;

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
                " bookedDate'" + bookedDate+ '\'' +
                ", paymentMethod='" + paymentMethod+ '\'' +
                '}';
    }
}
