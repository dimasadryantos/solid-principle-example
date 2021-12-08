package com.solid.principle.lsp.violate;

public class WhatsApp extends SocialMedia {
    public void chatWithFriend() {

    }

    /**
     * Currently we are extending SocialMedia and WhatsApp have to implement this feature ,
     * the fact is WhatsApp does not support publish post , it goes against Liskov Substitution Principle
     * NOTES :
     * - don't use inheritance to save a few lines of code,
     * - also we have to know the behaviour of the object are those replaceAble ?
     */
    public void publishPost() {

    }

    public void sendPhotoOrVideo() {

    }

    public void groupVideoCall() {

    }
}
