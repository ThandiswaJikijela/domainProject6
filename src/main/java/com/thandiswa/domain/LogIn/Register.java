package com.thandiswa.domain.LogIn;

public class Register {
    private String name, address,email,username,password;

     private Register(){}

     private Register(Builder builder)
     {
         this.name = builder.name;
         this.address = builder.address;
         this.email = builder.email;
         this.username = builder.username;
         this.password = builder.password;
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
        private String name, address,email,username,password;
        //private Set<Member> member;

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

        public Register build(){
            return new Register(this);
        }
    }

    public String toString(){
        return"Register{" +
                "name='" +name+ '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
