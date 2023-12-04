package com.messaging.messaging.Email.infra.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;

import com.messaging.messaging.Email.Domain.Enum.StatusEmail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Email")
public class EmailEntity implements Serializable {
    
    @Id
    @Column(name = "idemail")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long emailId;

    @Column(name = "proprietarioRef")
    private String ownerRef;

    @Column(name = "emailDe")
    private String emailFrom;

    @Column(name = "emailPara")
    private String emailTo;

    @Column(name = "assunto")
    private String subject;

    @Column(name = "texto", columnDefinition = "TEXT")
    private String text;

    @CurrentTimestamp
    @Column(name = "data_envio_email")
    private LocalDateTime SendDateEmail;

    @Column(name= "status")
    private StatusEmail statusEmail;
}
