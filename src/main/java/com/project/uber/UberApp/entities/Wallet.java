package com.project.uber.UberApp.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private Double balance;

    @OneToMany(mappedBy = "wallet")
    private Set<WalletTransactions> transactions;


}
