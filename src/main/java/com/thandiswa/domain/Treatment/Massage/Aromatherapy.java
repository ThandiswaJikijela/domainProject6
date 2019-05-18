package com.thandiswa.domain.Treatment.Massage;

public class Aromatherapy {
    private MassageTreatment massageTreatment = new MassageTreatment();
    private String fragrantEssentialOil;

    private Aromatherapy()
    {
        super();
    }

    private Aromatherapy(Builder builder)
    {
        this.fragrantEssentialOil = builder.fragrantEssentialOil;
    }

    public String getFragrantEssentialOil() {
        return fragrantEssentialOil;
    }

    public static class Builder{
        private String fragrantEssentialOil;
        //private Set<MassageTreatment> MassageTreatment;

        public Builder fragrantEssentialOil(String fragrantEssentialOil)
        {
            this.fragrantEssentialOil = fragrantEssentialOil;
            return this;
        }

        public Aromatherapy build()
        {
            return new Aromatherapy(this);
        }
    }
    public String toString(){
        return"Aromatherapy{" +
                " ='" +massageTreatment.toString()+
                "Fragrant Essential Oil ='" +fragrantEssentialOil+
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
