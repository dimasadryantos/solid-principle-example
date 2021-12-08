package com.solid.principle.isp.violate;

public class Lion implements Animal {

    public void eat() {
    }

    /**
     * this implementation against Interface Segregation Principle
     * No Client Should be forced to depend on methods that is does not use
     */
    public void groom() {

    }
}
