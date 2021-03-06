package com.thandiswa.domain.LogIn;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Register {
    private String regID, name, address,email,username,password;

     private Register(){}

     private Register(Builder builder)
     {
         this.regID = builder.regID;
         this.name = builder.name;
         this.address = builder.address;
         this.email = builder.email;
         this.username = builder.username;
         this.password = builder.password;
     }

    public String getRegID() {
        return regID;
    }

    public String getName() {
        return name;
    }

     public String getAddress() {
        return address;
    }

     public String getEmail() {
        return email;
    }

     public String getUsername() {
        return username;
    }

     public String getPassword() {
        return password;
    }

    public static class Builder {
        private String regID, name, address,email,username,password;
        //private Set<Member> member;

        public Builder regID(String regID)
        {
            this.regID = regID;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder copy(Register register) {
            this.name = register.name;
            this.address = register.address;
            this.email = register.email;
            this.username = register.username;
            this.password = register.password;

            return this;
        }

        public Register build(){
            return new Register(this);
        }
    }

    public String toString(){
        return"Register{" +
                "regID ='" +regID+ '\'' +
                ", name ='" +name+ '\'' +
                ", address ='" + address + '\'' +
                ", email='" + email + '\'' +
                ", username ='" + username + '\'' +
                ", password ='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Register register = (Register) obj;
        return regID.equals(register.regID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regID);
    }
}
