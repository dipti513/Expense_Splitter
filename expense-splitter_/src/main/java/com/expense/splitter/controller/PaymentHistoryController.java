package com.expense.splitter.controller;

import com.expense.splitter.model.PaymentHistory;
import com.expense.splitter.service.PaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment-histories")
public class PaymentHistoryController {
    @Autowired
    private PaymentHistoryService paymentHistoryService;

    @PostMapping
    public PaymentHistory createPaymentHistory(@RequestBody PaymentHistory paymentHistory) {
        return paymentHistoryService.createPaymentHistory(paymentHistory);
    }

    @GetMapping("/{id}")
    public PaymentHistory getPaymentHistoryById(@PathVariable Long id) {
        return paymentHistoryService.getPaymentHistoryById(id);
    }
}