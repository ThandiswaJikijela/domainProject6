package com.thandiswa.domain.LogIn;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class LogIn {
    private String staffID, username, password;

    private LogIn(){}

    private LogIn(Builder builder)
    {
        this.staffID = builder.staffID;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{
        private String staffID,username, password;
        //private Set<Member> member;

        public Builder staffID(String staffID){
            this.staffID = staffID;
            return this;
        }

        public Builder username(String username)
        {
            this.username = username;
            return this;
        }

        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Builder copy(LogIn logIn){
            this.staffID = logIn.staffID;
            this.username = logIn.username;
            this.password = logIn.password;

            return this;
        }

        public LogIn build(){
            return new LogIn(this);
        }
    }

    public String toString(){
        return"LogIn{" +
                "Staff ID ='" +staffID+ '\'' +
                ", Username ='" +username+ '\'' +
                ", Password ='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        LogIn logIn = (LogIn) obj;
        return staffID.equals(logIn.staffID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffID);
    }
}
