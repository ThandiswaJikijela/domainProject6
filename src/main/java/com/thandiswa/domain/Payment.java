package com.thandiswa.domain;

import java.util.Objects;

public class Payment {
    private String creditCardNo;
    private double refund;
    private String memberID;

    private Payment(){}

    private Payment (Builder builder)
    {
        this.creditCardNo = builder.creditCardNo;
        this.refund = builder.refund;
        this.memberID = builder.memberID;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public double getRefund() {
        return refund;
    }

    public String getMemberID() {
        return memberID;
    }

    public static class Builder{
        private String creditCardNo;
        private double refund;
        private String memberID;

        public Builder creditCardNo(String creditCardNo){
            this.creditCardNo = creditCardNo;
            return this;
        }

        public Builder refund(double refund){
            this.refund = refund;
            return this;
        }

        public Builder memberID(String memberID)
        {
            this.memberID = memberID;
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
                ", memberID'" + memberID  + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Payment payment = (Payment) obj;
        return memberID.equals(payment.memberID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberID);
    }
}
