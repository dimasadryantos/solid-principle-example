package com.solid.principle.dip.violate;

public class CreditCard {

    public void doTransaction(long amount) {
        System.out.println("CREDIT CARD TRANSACTION" + amount);
    }
}
