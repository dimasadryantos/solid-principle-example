package com.solid.principle.ocp.bestpractice;


//NotificationService act as SuperClass (we can use abstract and extend but for now i use interface)
public class WhatsAppNotificationService implements NotificationService {

    public void sendOtp() {
        // implement logic to integrate whatsApp API
    }

}
