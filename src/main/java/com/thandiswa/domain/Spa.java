package com.thandiswa.domain;

public class Spa {
    private String spaName,address;

    private Spa(){}

    private Spa(Builder builder)
    {
        this.spaName = builder.spaName;
        this.address = builder.address;

    }

    public String getSpaName()
    {
        return spaName;
    }

    public String getAddress()
    {
        return address;
    }

    public static class Builder{
        private String spaName, address;

        public Builder spaName(String spaName){
            this.spaName = spaName;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Spa build(){
            return new Spa(this);
        }
    }

    public String toString(){
        return"Spa{" +
                "spaName='" +spaName+ '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
