package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Payment;
import com.thandiswa.repository.PaymentRepository;

import java.util.*;

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
        this.paymentMap.put(payment.toString(),payment);
        return payment;
    }

    @Override
    public Payment read(String p) {
        Payment payment = paymentMap.get(toString());
        return payment;
    }

    @Override
    public Payment update(Payment payment) {
        this.paymentMap.replace(payment.toString(),payment);
        return this.paymentMap.get(payment.toString());
    }

    @Override
    public void delete(String p) {
        paymentMap.remove(toString());
    }

    @Override
    public Set<Payment> getAll() {
        Collection<Payment> payments = this.paymentMap.values();
        Set<Payment> set = new HashSet<>();
        set.addAll(payments);
        return set;

    }
}
