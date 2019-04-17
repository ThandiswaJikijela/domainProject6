package domain.Staff;

import java.util.Set;

public class SpaAdmin extends Staff{
    private String adminID,password;

    protected SpaAdmin(){
        super();
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
        private Set<SpaAdmin> SpaAdmin;

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
                "Admin ID'" + adminID + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}
