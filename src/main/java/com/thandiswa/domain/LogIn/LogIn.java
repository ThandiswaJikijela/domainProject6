package com.thandiswa.domain.LogIn;

public class LogIn {
    private String username, password;

    private LogIn(){}

    private LogIn(Builder builder)
    {
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean verifyPassword()
    {
        return verifyPassword();
    }

    public boolean verifyUsername()
    {
        return verifyUsername();
    }

    public static class Builder{
        private String username, password;
        //private Set<Member> member;

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

        public LogIn build(){
            return new LogIn(this);
        }
    }

    public String toString(){
        return"LogIn{" +
                "username='" +username+ '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
