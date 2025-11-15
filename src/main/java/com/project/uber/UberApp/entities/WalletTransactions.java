package com.project.uber.UberApp.entities;

import com.project.uber.UberApp.entities.enums.TransactionMethod;
import com.project.uber.UberApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class WalletTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.LAZY)
    private TransactionType transactionType;


    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.LAZY)
    private TransactionMethod transactionMethod;

    @OneToOne
    private Ride ride;

    private String transactionId;

    @CreationTimestamp
    private LocalDateTime timestamp;

    @ManyToOne
    private Wallet wallet;
}
