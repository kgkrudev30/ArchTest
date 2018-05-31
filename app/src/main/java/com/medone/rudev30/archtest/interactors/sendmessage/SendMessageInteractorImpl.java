package com.medone.rudev30.archtest.interactors.sendmessage;

import android.os.Message;

import java.util.Observable;

/**
 * Created by Orlov Denis on 29.05.2018.
 * ru.dev30@kgk-global.com
 */
public class SendMessageInteractorImpl implements SendMessageInteractor, SendMessageGatewayCallback {

    private SendMessagePresentation presentation;

    private SendMessageGateway gateway;

    private int stickerId;

    public SendMessageInteractorImpl(SendMessageGateway gateway) {
        this.gateway = gateway;
    }


    @Override
    public void attachPresentation(SendMessagePresentation presentation) {
        this.presentation = presentation;
    }

    @Override
    public void setValue(int stickerId) {
        this.stickerId = stickerId;

    }

    @Override
    public void execute() {
        if(isValueValid(stickerId)) {
            sendMessage();
        }else{
            throwException();
        }
    }


    @Override
    public void onMessageSended(int messageId) {
        presentation.onMessageSended();
    }

    private boolean isValueValid(int stickerId){
        return stickerId > 0;
    }

    private void sendMessage(){
       // Message message = new StickerMessage( int stickerId);
        //tryToSendMessage(message);

    }

    private void tryToSendMessage(Message message) {
        try {
            gateway.sendMessage(message);
        }catch (Exception e){
            throw new StorageException();
        }

    }

    private void throwException(){
        throw new IllegalArgumentException("Can't find sticker identeficator!");
    }
}
