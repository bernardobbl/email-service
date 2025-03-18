package com.kipper.email_service.core; //Define a lógica de negocios da aplicação.

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject , String body); //definiu a interface que define o contrato da aplicação

}
