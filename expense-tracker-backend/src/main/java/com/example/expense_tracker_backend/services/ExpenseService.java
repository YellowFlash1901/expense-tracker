package com.example.expense_tracker_backend.services;

import com.example.expense_tracker_backend.dto.ExpenseDto;
import com.example.expense_tracker_backend.entity.Expense;

public interface ExpenseService {
    Expense postExpense(ExpenseDto expenseDto);
}
