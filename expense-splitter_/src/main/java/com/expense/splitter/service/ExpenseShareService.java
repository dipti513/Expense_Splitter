package com.expense.splitter.service;

import com.expense.splitter.model.ExpenseShare;
import com.expense.splitter.repository.ExpenseShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseShareService {
    @Autowired
    private ExpenseShareRepository expenseShareRepository;

    public ExpenseShare createExpenseShare(ExpenseShare expenseShare) {
        return expenseShareRepository.save(expenseShare);
    }

    public ExpenseShare getExpenseShareById(Long id) {
        return expenseShareRepository.findById(id).orElse(null);
    }
}