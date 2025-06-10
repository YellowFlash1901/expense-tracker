package com.example.expense_tracker_backend.controller;


import com.example.expense_tracker_backend.dto.ExpenseDto;
import com.example.expense_tracker_backend.entity.Expense;
import com.example.expense_tracker_backend.services.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expense")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ExpenseController {
    private final ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<?> postExpense(@RequestBody ExpenseDto dto){
        Expense createdExpense = expenseService.postExpense(dto);
        if(createdExpense != null){
        return ResponseEntity.status(HttpStatus.CREATED).body(createdExpense);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }
    }
}
