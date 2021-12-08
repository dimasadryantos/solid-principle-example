package com.solid.principle.srp.bestpractice;

/**
 * This class is responsible for Loan Interest Info only
 */
public class LoanInterestInfoService {

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("loan A")) {
            System.out.println("9000");
        } else if (loanType.equals("loan B")) {
            System.out.println("1000");
        } else if (loanType.equals("loan C")) {
            System.out.println("2000");
        }
    }

}
