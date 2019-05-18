package com.thandiswa.domain.Treatment.Body;

public class BodyWraps {
    private BodyTreatment bodyTreatment = new BodyTreatment();
    private String wrapMaterials;

    private BodyWraps()
    {
        super();
    }

    private BodyWraps(Builder builder){
        this.wrapMaterials = builder.wrapMaterials;
    }

    public String getWrapMaterials() {
        return wrapMaterials;
    }

    public static class Builder{
        private String wrapMaterials;
        //private Set<BodyTreatment> BodyTreatment;

        public Builder wrapMaterials(String wrapMaterials)
        {
            this.wrapMaterials = wrapMaterials;
            return this;
        }

        public BodyWraps build()
        {
            return new BodyWraps(this);
        }

    }
    public String toString(){
        return"BodyWraps{" +
                "treatment Id ='" +bodyTreatment.getTreatmentID()+
                "wrapMaterials ='" +wrapMaterials+
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
