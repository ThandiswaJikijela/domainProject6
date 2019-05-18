package com.thandiswa.domain;

import java.util.Objects;

public class Member {
    private String name, address,phoneNumber;
    private String memberId;

    private Member(){}

    private Member (Builder builder){
        this.name = builder.name;
        this.address = builder.address;
        this.memberId = builder.memberId;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder{
        private String name, address, phoneNumber;
        private String memberId;
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

        public Builder id(String memberId)
        {
            this.memberId = memberId;
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
                ", Id='" + memberId + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Member member = (Member) obj;
        return memberId.equals(member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }
}
