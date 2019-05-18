package com.thandiswa.domain.Staff;

import java.util.Objects;

public class SpaAdmin {
    private Staff staff = new Staff();
    private String adminID,password;

    protected SpaAdmin(){
    }

    private SpaAdmin (Builder builder)
    {
       this.adminID = builder.adminID;
       this.password = builder.password;
    }

    public String getAdminID() {
        return adminID;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{
        private String adminID,password;
        //private Set<SpaAdmin> SpaAdmin;

        public Builder adminID(String adminID)
        {
            this.adminID = adminID;
            return this;
        }

        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public SpaAdmin build()
        {
            return new SpaAdmin(this);
        }
    }
    public String toString() {
        return "SpaAdmin{" +
                "Admin ID ='" + adminID + '\'' +
                ", Password ='" + password + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        SpaAdmin spaAdmin = (SpaAdmin) obj;
        return adminID.equals(spaAdmin.adminID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminID);
    }
}
