package com.solid.principle.dip.bestpractice;

public class DebitCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("DEBIT CARD TRANSACTION" + amount);
    }


}
