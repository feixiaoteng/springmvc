package com.fei.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author feixiaoteng
 * @create 2019-08-04 1:50
 */
@ResponseStatus(value=HttpStatus.UNAUTHORIZED)
public class DTFException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public DTFException() {
    }

    public DTFException(String message) {
        super(message);
        this.message = message;
    }
}
