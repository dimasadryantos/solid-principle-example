package com.solid.principle.dip.bestpractice;

/**
 * This class is tightly coupled with DebitCard class , which is against Dependency Inversion
 * Root cause : what if we want to change payment to credit card ? we will change constructor,method and main method
 * NOTE : In java there is no concept you can completely make zero losely coupled , we need to rely on design pattern
 */
public class ShoppingMall {

    private BankCard bankCard;


    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }


    public void doPurchase(long amount) {
        bankCard.doTransaction(amount);
    }

    /**
     * now you can only change one line and implement polymorphysm
     *
     * @param args
     */
    public static void main(String[] args) {
        //we only change this line
        BankCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchase(1000);

        //and in case we want to use credit card
        BankCard creditCard = new CreditCard();
        //     ShoppingMall shoppingMall2 = new ShoppingMall(creaditCard);
        shoppingMall.doPurchase(1000);
    }
}
