package com.phegon.phegonbank.transaction.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.phegon.phegonbank.account.dtos.AccountDTO;
import com.phegon.phegonbank.account.entity.Account;
import com.phegon.phegonbank.enums.TransactionStatus;
import com.phegon.phegonbank.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//@Entity
@Data
@Builder
@Table(name = "transation")
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {


    private Long id;

    private BigDecimal amount;

    private TransactionType transactionType;

    private LocalDateTime transactionDate;

    private String description;

    private TransactionStatus status;

    @JsonBackReference
    private AccountDTO account;


    //for transfer
    private String sourceAccount;
    private String destinationAccount;

}

