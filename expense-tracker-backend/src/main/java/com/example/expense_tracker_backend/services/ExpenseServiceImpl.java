package com.example.expense_tracker_backend.services;


import com.example.expense_tracker_backend.dto.ExpenseDto;
import com.example.expense_tracker_backend.entity.Expense;
import com.example.expense_tracker_backend.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    public Expense postExpense(ExpenseDto expenseDto){

    return saveOrUpdateExpense(new Expense(), expenseDto);
    }

    private Expense saveOrUpdateExpense(Expense expense, ExpenseDto expenseDto){
    expense.setTitle(expenseDto.getTitle());
    expense.setCategory(expenseDto.getCategory());
    expense.setDate(expenseDto.getDate());
    expense.setId(expenseDto.getId());
    expense.setAmount(expenseDto.getAmount());

    return expenseRepository.save(expense); }
}
