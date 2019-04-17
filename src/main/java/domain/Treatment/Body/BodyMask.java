package domain.Treatment.Body;

import java.util.Set;

public class BodyMask extends BodyTreatment {
    private String maskIngredients;

    private BodyMask()
    {
        super();
    }

    private BodyMask(Builder builder){
        this.maskIngredients = builder.maskIngredients;
    }

    public String getMaskIngredients() {
        return maskIngredients;
    }

    public static class Builder{
        private String maskIngredients;
        private Set<BodyTreatment>BodyTreatment;

        public Builder maskIngredients(String maskIngredients)
        {
            this.maskIngredients = maskIngredients;
            return this;
        }

        public BodyMask build()
        {
            return new BodyMask(this);
        }

    }
    public String toString(){
        return"BodyMask{" +
                "maskIngredients='" +maskIngredients+
                '}';
    }
}
