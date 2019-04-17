package domain.Treatment.Body;

import java.util.Set;

public class BodyWraps extends BodyTreatment {
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
        private Set<BodyTreatment> BodyTreatment;

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
                "wrapMaterials='" +wrapMaterials+
                '}';
    }
}
