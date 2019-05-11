package com.thandiswa.service;

import com.thandiswa.domain.Payment;

import java.util.Set;

public interface PaymentService extends IService<Payment, String> {
    Set<Payment> getAll();
}
