package com.kipper.email_service.core.exceptions;

import com.kipper.email_service.application.EmailSenderService;

//Camada para a regra de negocios e casos de uso da aplicação.

public class EmailServiceException extends RuntimeException {
    public EmailServiceException(String message) {
        super(message);
    }

    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
