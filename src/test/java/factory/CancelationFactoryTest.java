package factory;

import domain.Cancelation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CancelationFactoryTest {

    @Test
    public void getCancelation() {
        //Date bookedDate = 94-11-08;
        String paymentMethod = "CreditCard";
        Cancelation cancel = CancelationFactory.getCancelation(paymentMethod);
        System.out.println(cancel);
        Assert.assertNotNull(cancel.getPaymentMethod());
    }
}