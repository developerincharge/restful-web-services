package com.rizvi.rest.webservices.restful_web_services.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timpedatestamp;;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime timpedatestamp, String message, String details) {
        super();
        this.timpedatestamp = timpedatestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getDatetimpestamp() {
        return timpedatestamp;
    }
    public String getMessage() {
        return message;
    }
    public String getDetails() {
        return details;
    }
}
