package com.solid.principle.lsp.violate;

public abstract class SocialMedia {

    //only whatsApp,Instagram,Facebook are supported this feature
    public abstract void chatWithFriend();

    //only Instagram and facebook are supported this feature
    public abstract void publishPost();

    //only whatsApp,Instagram,Facebook are supported this feature
    public abstract void sendPhotoOrVideo();

    //only WhatsApp and Facebook are supported this feature
    public abstract void groupVideoCall();


}
