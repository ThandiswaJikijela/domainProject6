package domain;

import java.util.Set;

public class Member {
    private String name, address,phoneNumber;
    private int id;

    private Member(){}

    private Member (Builder builder){
        this.name = builder.name;
        this.address = builder.address;
        this.id = builder.id;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder{
        private String name, address, phoneNumber;
        private int id;
        //private Set<Spa> spa;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder address(String address)
        {
            this.address = address;
            return this;
        }

        public Builder id(int id)
        {
            this.id = id;
            return this;
        }

        public Builder phoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Member build() {
            return new Member(this);
        }
    }
    public String toString(){
        return"Member{" +
                "Name'" +name+ '\'' +
                ", Address='" + address + '\'' +
                ", Id='" + id + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
