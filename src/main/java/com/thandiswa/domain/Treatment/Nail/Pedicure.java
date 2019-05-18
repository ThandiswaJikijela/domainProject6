package com.thandiswa.domain.Treatment.Nail;

public class Pedicure extends NailTreatment {
    private NailTreatment nailTreatment = new NailTreatment();
    private String mediHeelPedicure;

    private Pedicure()
    {

        super();
    }

    private Pedicure(Builder builder)
    {
        this.mediHeelPedicure = builder.mediHeelPedicure;
    }

    public String getMediHeelPedicure()
    {
        return mediHeelPedicure;
    }

    public static class Builder{
        private String mediHeelPedicure;
        //private Set<NailTreatment> nailTreatmentSet;

        public Builder mediHeelPedicure(String mediHeelPedicure)
        {
            this.mediHeelPedicure = mediHeelPedicure;
            return this;
        }

        public Pedicure build()
        {
            return new Pedicure(this);
        }
    }
    public String toString() {
        return "Pedicure{" +
                "Treatment ID'" + nailTreatment.getTreatmentID() +
                "Medi-Heel Pedicure'" + mediHeelPedicure +
                '}';
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Booking booking = (Booking) obj;
        return reservationID.equals(booking.reservationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID);
    }

     */
}
