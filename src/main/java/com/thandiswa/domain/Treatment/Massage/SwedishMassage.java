package com.thandiswa.domain.Treatment.Massage;

public class SwedishMassage{
    private MassageTreatment massageTreatment = new MassageTreatment();
    private String carrierOil;

    private SwedishMassage()
    {
        super();
    }

    private SwedishMassage(Builder builder)
    {
        this.carrierOil = builder.carrierOil;
    }

    public String getCarrierOil() {
        return carrierOil;
    }

    public static class Builder{
        private String carrierOil;
        //private Set<MassageTreatment> MassageTreatment;

        public Builder carrierOil(String carrierOil)
        {
            this.carrierOil = carrierOil;
            return this;
        }

        public SwedishMassage build()
        {
            return new SwedishMassage(this);
        }
    }
    public String toString(){
        return"SwedishMassage{" +
                " ='" +massageTreatment.toString()+
                "Carrier Oils ='" +carrierOil+
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
