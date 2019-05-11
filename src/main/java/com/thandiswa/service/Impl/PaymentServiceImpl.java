package com.thandiswa.service.Impl;

import com.thandiswa.domain.Payment;
import com.thandiswa.repository.Impl.PaymentRepositoryImpl;
import com.thandiswa.repository.PaymentRepository;
import com.thandiswa.service.PaymentService;

import java.util.Set;

public class PaymentServiceImpl implements PaymentService {
    private static PaymentServiceImpl service = null;
    private PaymentRepository repository;

    private PaymentServiceImpl() {
        this.repository = PaymentRepositoryImpl.getRepository();
    }

    public static PaymentServiceImpl getService(){
        if (service == null) service = new PaymentServiceImpl();
        return service;
    }

    @Override
    public Payment create(Payment payment) {
        return this.repository.create(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return this.repository.update(payment);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Payment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Payment> getAll() {
        return this.repository.getAll();
    }
}
