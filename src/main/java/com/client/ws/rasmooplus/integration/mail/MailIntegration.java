package com.client.ws.rasmooplus.integration.mail;

public interface MailIntegration {

    void send(String mailTo, String message, String subject);
}
