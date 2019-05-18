package com.thandiswa.domain.Treatment.Massage;

public class TissueMassage {
    private MassageTreatment massageTreatment = new MassageTreatment();
    private String massagePressure;

    private TissueMassage()
    {
        super();
    }

    private TissueMassage(Builder builder)
    {
        this.massagePressure= builder.massagePressure;
    }

    public String getMassagePressure() {
        return massagePressure;
    }

    public static class Builder{
        private String massagePressure;
        //private Set<MassageTreatment> MassageTreatment;

        public Builder massagePressure(String massagePressure)
        {
            this.massagePressure = massagePressure;
            return this;
        }

        public TissueMassage build()
        {
            return new TissueMassage(this);
        }
    }
    public String toString(){
        return"TissueMassage{" +
                "Treatment ID ='" +massageTreatment.getTreatmentID()+
                "Massage Pressure ='" +massagePressure+
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
