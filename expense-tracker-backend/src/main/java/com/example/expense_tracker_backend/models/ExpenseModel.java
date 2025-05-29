package com.example.expense_tracker_backend.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class ExpenseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //expense id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel user;

    @NotNull
    @Positive
    private BigDecimal amount;

    @Nullable
    private StringBuilder description;

    @NotNull
    private Date date;

//    @Nullable
//    @ManyToMany
//    private Integer category_id;

    @CreatedDate
    @NotNull
    private LocalDateTime created_at;

    @LastModifiedDate
    @NotNull
    private LocalDateTime  updated_at;
}
