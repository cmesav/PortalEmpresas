package com.banistmo.exceptions;

public class FileError extends AssertionError {

    public FileError(String message, Throwable cause) {
        super(message, cause);
    }
}
