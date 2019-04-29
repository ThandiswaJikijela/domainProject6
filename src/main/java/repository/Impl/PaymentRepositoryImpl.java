package repository.Impl;

import domain.Payment;
import repository.PaymentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PaymentRepositoryImpl implements PaymentRepository {

    private static PaymentRepositoryImpl repository = null;
    private Map<String, Payment> paymentMap;

    private PaymentRepositoryImpl(){
        this.paymentMap = new HashMap<String, Payment>();
    }

    public static PaymentRepositoryImpl getRepository()
    {
        if (repository == null) repository = new PaymentRepositoryImpl();
        return repository;
    }

    @Override
    public Payment create(Payment payment) {
        paymentMap.put(payment.getCreditCardNo(),payment);
        paymentMap.put(payment.getCustomerID(),payment);
        //paymentMap.put(payment.toString(),payment);
        Payment savedPayment = paymentMap.get(toString());
        return savedPayment;
    }

    @Override
    public Payment read(String p) {
        Payment payment = paymentMap.get(toString());
        return payment;
    }

    @Override
    public Payment update(Payment payment) {
        paymentMap.put(payment.toString(),payment);
        Payment savedPayment = paymentMap.get(toString());
        return savedPayment;
    }

    @Override
    public void delete(String p) {
        paymentMap.remove(toString());
    }

    @Override
    public Set<Payment> getAll() {
        return (Set<Payment>) paymentMap;
    }
}
