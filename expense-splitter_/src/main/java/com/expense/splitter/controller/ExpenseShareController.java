package com.expense.splitter.controller;

import com.expense.splitter.model.ExpenseShare;
import com.expense.splitter.service.ExpenseShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expense-shares")
public class ExpenseShareController {
    @Autowired
    private ExpenseShareService expenseShareService;

    @PostMapping
    public ExpenseShare createExpenseShare(@RequestBody ExpenseShare expenseShare) {
        return expenseShareService.createExpenseShare(expenseShare);
    }

    @GetMapping("/{id}")
    public ExpenseShare getExpenseShareById(@PathVariable Long id) {
        return expenseShareService.getExpenseShareById(id);
    }
}