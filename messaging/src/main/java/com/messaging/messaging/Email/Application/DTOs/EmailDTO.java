package com.messaging.messaging.Email.Application.DTOs;

import lombok.Data;

@Data
public class EmailDTO {

    private String ownerRef;

    private String emailFrom;
    
    private String emailTo;
    
    private String subject;
    
    private String text;
}