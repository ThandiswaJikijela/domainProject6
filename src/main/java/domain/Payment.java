package domain;

public class Payment {
    private String creditCardNo;
    private double refund;
    private String customerID;

    private Payment(){}

    private Payment (Builder builder)
    {
        this.creditCardNo = builder.creditCardNo;
        this.refund = builder.refund;
        this.customerID = builder.customerID;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public double getRefund() {
        return refund;
    }

    public String getCustomerID() {
        return customerID;
    }

    public static class Builder{
        private String creditCardNo;
        private double refund;
        private String customerID;

        public Builder creditCardNo(String creditCardNo){
            this.creditCardNo = creditCardNo;
            return this;
        }

        public Builder refund(double refund){
            this.refund = refund;
            return this;
        }

        public Builder customerID(String customerID)
        {
            this.customerID = customerID;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
    public String toString(){
        return"Payment{" +
                "CreditCardNo'" +creditCardNo+ '\'' +
                ", Refund='" + refund + '\'' +
                ", customerID'" + customerID  + '\'' +
                '}';
    }
}
