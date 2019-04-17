package factory;

import domain.Payment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentFactoryTest {

    @Test
    public void getPayment() {
        String creditCardNo = "8745665432df";
        double refund = 500.59;
        String customerID = "78634sd";
        Payment pay = PaymentFactory.getPayment(creditCardNo,refund,customerID);
        System.out.println(pay);
        Assert.assertNotNull(pay.toString());
    }
}