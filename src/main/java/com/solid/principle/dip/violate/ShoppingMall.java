package com.solid.principle.dip.violate;

/**
 * This class is tightly coupled with DebitCard class , which is against Dependency Inversion
 * Root cause : what if we want to change payment to credit card ? we will change constructor,method and main method
 */
public class ShoppingMall {

    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }


    public void doPurchase(long amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchase(1000);
    }
}
