package com.example.paymentservice.service;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment processPayment(Payment paymentReq) {
        paymentReq.setTransactionId(UUID.randomUUID().toString());
        repository.save(paymentReq);
        paymentReq.setStatus("payment success");
        return paymentReq;
    }

    public Payment getPaymentDetails(Integer paymentId) {
        Optional<Payment> paymentOptional = repository.findById(paymentId);
        return paymentOptional.orElseGet(Payment::new);
    }
}
