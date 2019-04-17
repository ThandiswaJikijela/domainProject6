package domain.Staff;

public class Staff {
    private String name, email, phone, address;

    protected Staff(){}

    private Staff(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder{
        private String name, email, phone, address;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder email(String email)
        {
            this.email = email;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }
    public String toString(){
        return"Staff{" +
                "Name'" +name+ '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
