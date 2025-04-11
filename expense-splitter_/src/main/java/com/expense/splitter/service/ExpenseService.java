package com.expense.splitter.service;

import com.expense.splitter.model.Expense;
import com.expense.splitter.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
