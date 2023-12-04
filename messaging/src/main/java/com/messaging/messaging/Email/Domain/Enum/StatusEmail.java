package com.messaging.messaging.Email.Domain.Enum;

public enum StatusEmail {
    SENT(1),
    NOTSENT(0),
    ERROR(2);

    private final int status;

    StatusEmail(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
