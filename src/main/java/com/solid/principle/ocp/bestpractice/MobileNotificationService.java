package com.solid.principle.ocp.bestpractice;

//NotificationService act as SuperClass (we can use abstract and extend it, but for now i use interface)
public class MobileNotificationService implements NotificationService {
    public void sendOtp() {
        //logic to send OTP to mobile using twilio API
    }
}
