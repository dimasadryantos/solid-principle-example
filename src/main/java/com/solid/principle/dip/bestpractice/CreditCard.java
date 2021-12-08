package com.solid.principle.dip.bestpractice;

public class CreditCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("CREDIT CARD TRANSACTION" + amount);
    }
}
