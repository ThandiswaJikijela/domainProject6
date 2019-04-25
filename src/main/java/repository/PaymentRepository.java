package repository;

import domain.Payment;

import java.util.Set;

public interface PaymentRepository extends IRepository<Payment, String>{
    Set<Payment> getAll();
}
