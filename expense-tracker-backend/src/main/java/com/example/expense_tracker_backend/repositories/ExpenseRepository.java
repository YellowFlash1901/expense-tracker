package com.example.expense_tracker_backend.repositories;


import com.example.expense_tracker_backend.models.ExpenseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseModel , Long> {

}
