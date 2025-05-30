package com.example.expense_tracker_backend.controllers;


import com.example.expense_tracker_backend.models.ExpenseModel;
import com.example.expense_tracker_backend.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add-expense")
    public ResponseEntity<ExpenseModel> addExpense(@RequestBody ExpenseModel expenseModel){
        return ResponseEntity.ok(expenseService.addNewExpense(expenseModel));
    }
}
