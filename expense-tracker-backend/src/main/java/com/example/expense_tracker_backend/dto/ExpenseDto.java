package com.example.expense_tracker_backend.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseDto {

    private Long id;

    private String title;

    private String category;

    private String description;

    private LocalDate date;


    private Integer amount;

}
