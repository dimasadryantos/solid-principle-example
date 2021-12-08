package com.solid.principle.ocp.violate;

public class NotificationService {

    /**
     * Now we want to add another logic for our new existing feature,
     * We would have modify method bellow and added new logic by adding another if else statement
     * Which goes against Open Close Principle
     *
     * @param type
     */
    public void sendOTP(String type) {

        if (type.equals("EMAIL")) {
            //LOGIC
        } else if (type.equals("MOBILE")) {
            //LOGIC
        }


    }


}
