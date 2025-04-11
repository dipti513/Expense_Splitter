package com.expense.splitter.service;

import com.expense.splitter.model.PaymentHistory;
import com.expense.splitter.repository.PaymentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentHistoryService {
    @Autowired
    private PaymentHistoryRepository paymentHistoryRepository;

    public PaymentHistory createPaymentHistory(PaymentHistory paymentHistory) {
        return paymentHistoryRepository.save(paymentHistory);
    }

    public PaymentHistory getPaymentHistoryById(Long id) {
        return paymentHistoryRepository.findById(id).orElse(null);
    }
}