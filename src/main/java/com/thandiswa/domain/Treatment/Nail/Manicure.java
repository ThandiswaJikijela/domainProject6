package com.thandiswa.domain.Treatment.Nail;

public class Manicure extends NailTreatment {
    private NailTreatment nailTreatment = new NailTreatment();
    private String nailStyle;

    private Manicure()
    {
        super();
    }

    private Manicure(Builder builder){
        this.nailStyle = builder.nailStyle;
    }

    public String getNailStyle() {
        return nailStyle;
    }

    public static class Builder{
        private String nailStyle;
        //private Set<NailTreatment> nailTreatmentSet;

        public Builder nailStyle(String nailStyle)
        {
            this.nailStyle = nailStyle;
            return this;
        }

        public Manicure build()
        {
            return new Manicure(this);
        }
    }
    public String toString() {
        return "Manicure{" +
                "Treatment ID'" + nailTreatment.getTreatmentID() +
                "Nail Style'" + nailStyle +
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
