package com.thandiswa.domain.Staff;

public class Staff {
    private String name, email, phone, address;

    protected Staff(){}

    private Staff(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
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

        public Builder phone(String phone)
        {
            this.phone = phone;
            return this;
        }

        public Builder address(String address)
        {
            this.address = address;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }
    public String toString(){
        return"Staff{" +
                "Name'" +name+ '\'' +
                ", Email ='" + email + '\'' +
                ", Phone Number ='" + phone + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }
}
