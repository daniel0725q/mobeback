package com.quinterodaniel.mobeback.user.domain.exception;

public class UserEmailNotAvailableException extends IllegalArgumentException {
    public UserEmailNotAvailableException(String message) {
        super(message);
    }
}
