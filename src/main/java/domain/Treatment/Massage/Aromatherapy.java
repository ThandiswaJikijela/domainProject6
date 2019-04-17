package domain.Treatment.Massage;

import java.util.Set;

public class Aromatherapy extends MassageTreatment{
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
        private Set<MassageTreatment> MassageTreatment;

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
                "Fragrant Essential Oil ='" +fragrantEssentialOil+
                '}';
    }
}
