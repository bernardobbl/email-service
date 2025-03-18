package com.kipper.email_service.adapters; //Representa o contrato da aplicação com o provedor de serviços

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}

//adaptação o mundo externo para a aplicação.