package com.thandiswa.domain;

import java.util.Objects;

public class Spa {
    private String spaId, spaName,address;

    private Spa(){}

    private Spa(Builder builder)
    {
        this.spaId = builder.spaId;
        this.spaName = builder.spaName;
        this.address = builder.address;

    }

    public String getSpaId() {
        return spaId;
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
        private String spaId, spaName, address;

        public Builder spaId(String spaId){
            this.spaId = spaId;
            return this;
        }

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
                "spaId ='" +spaId+ '\'' +
                "spaName ='" +spaName+ '\'' +
                ", address ='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Spa spa = (Spa) obj;
        return spaId.equals(spa.spaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaId);
    }
}
