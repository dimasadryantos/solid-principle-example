package com.solid.principle.lsp.violate;

public class Instagram extends SocialMedia {
    public void chatWithFriend() {

    }

    public void publishPost() {

    }

    public void sendPhotoOrVideo() {

    }

    /**
     * Currently we are extending SocialMedia and Instagram have to implement this feature ,
     * the fact is instagram does not support this feature , it goes against LiskovSubstitution Principle
     * NOTE : don't use inheritance to save a few lines of code, also we have to know the behaviour of the object
     */
    public void groupVideoCall() {
    }
}
