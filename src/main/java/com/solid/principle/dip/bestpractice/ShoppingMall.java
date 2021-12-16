package com.solid.principle.dip.bestpractice;


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
     * in java we cannot make 0% coupled  , that's why we need to rely on design pattern
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
