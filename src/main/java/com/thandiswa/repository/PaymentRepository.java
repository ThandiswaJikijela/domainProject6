package com.thandiswa.repository;

import com.thandiswa.domain.Payment;

import java.util.Set;

public interface PaymentRepository extends IRepository<Payment, String>{
    Set<Payment> getAll();
}
