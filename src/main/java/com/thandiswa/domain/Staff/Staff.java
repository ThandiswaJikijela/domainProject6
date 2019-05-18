package com.thandiswa.domain.Staff;

import java.util.Objects;

public class Staff {
    private String staffID, name, email, phone, address;

    protected Staff(){}

    private Staff(Builder builder){
        this.staffID = builder.staffID;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getStaffID() {
        return staffID;
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
        private String staffID, name, email, phone, address;

        public Builder staffID(String staffID)
        {
            this.staffID = staffID;
            return this;
        }

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
                "Staff ID ='"+staffID+ '\'' +
                "Name ='" +name+ '\'' +
                ", Email ='" + email + '\'' +
                ", Phone Number ='" + phone + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Staff staffID = (Staff) obj;
        return staffID.equals(staffID.staffID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffID);
    }
}
