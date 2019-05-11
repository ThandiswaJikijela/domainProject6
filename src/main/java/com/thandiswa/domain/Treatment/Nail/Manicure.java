package com.thandiswa.domain.Treatment.Nail;

public class Manicure extends NailTreatment {
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
                "Nail Style'" + nailStyle +
                '}';
    }
}
