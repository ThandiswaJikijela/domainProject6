package com.thandiswa.domain.Treatment.Facial;

public class AntAgingFacial {
    private FacialTreatment facialTreatment = new FacialTreatment();
    private String poreIngredients;

    private AntAgingFacial(){
        super();
    }

    private AntAgingFacial(Builder builder)
    {
        this.poreIngredients = builder.poreIngredients;
    }

    public String getPoreIngredients() {
        return poreIngredients;
    }

    public static class Builder{
        private String poreIngredients;
        //private Set<FacialTreatment> FacialTreatment;

        public Builder poreIngredients(String poreIngredients)
        {
            this.poreIngredients = poreIngredients;
            return this;
        }

        public AntAgingFacial build()
        {
            return new AntAgingFacial(this);
        }
    }
    public String toString(){
        return"AntiAgingFacial{" +
                " ='" +facialTreatment.toString()+
                "Pore Ingredients ='" +poreIngredients+
                '}';
    }

   /* @Override
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
