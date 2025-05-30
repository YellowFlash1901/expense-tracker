package com.example.expense_tracker_backend.services;


import com.example.expense_tracker_backend.models.ExpenseModel;
import com.example.expense_tracker_backend.repositories.ExpenseRepository;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public ExpenseModel addNewExpense(ExpenseModel expenseModel){
        return expenseRepository.save(expenseModel);
    }
}
