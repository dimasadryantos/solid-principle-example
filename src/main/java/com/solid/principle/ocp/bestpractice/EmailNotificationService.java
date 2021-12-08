package com.solid.principle.ocp.bestpractice;

//NotificationService act as SuperClass (we can use abstract and extend it, but for now i use interface)
public class EmailNotificationService implements NotificationService {
    public void sendOtp() {
      //implement logic for send otp to email
    }
}
