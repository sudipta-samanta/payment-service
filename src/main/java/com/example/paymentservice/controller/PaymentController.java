package com.example.paymentservice.controller;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment processPayment(@RequestBody Payment paymentReq){
        return service.processPayment(paymentReq);
    }

    @GetMapping("/{paymentId}")
    public Payment getPaymentDetails(@PathVariable Integer paymentId){
        return service.getPaymentDetails(paymentId);
    }
}
