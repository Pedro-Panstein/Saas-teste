package com.taskmanager.saas.Repositories;

import com.taskmanager.saas.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}