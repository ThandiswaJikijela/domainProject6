package domain.Treatment.Nail;

import java.util.Set;

public class Pedicure extends NailTreatment {
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
        private Set<NailTreatment> nailTreatmentSet;

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
                "Medi-Heel Pedicure'" + mediHeelPedicure +
                '}';
    }
}
