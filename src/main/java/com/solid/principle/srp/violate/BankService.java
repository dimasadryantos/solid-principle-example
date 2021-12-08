package com.solid.principle.srp.violate;

/**
 * This class has to many responsibility to perform
 * and Violate Single Responsibility Principle
 * (Classes should be responsible for a single part or functionality)
 */
public class BankService {


    public long deposit() {
        return 10L;
    }


    public void sendOTP() {
        System.out.println("DO SEND OTP");
    }


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
