package com.messaging.messaging.Email.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messaging.messaging.Email.infra.entity.EmailEntity;

public interface EmailRepository extends JpaRepository<EmailEntity, Long> { }
