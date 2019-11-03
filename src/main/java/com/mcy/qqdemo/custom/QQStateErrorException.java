package com.mcy.qqdemo.custom;

public class QQStateErrorException extends Exception {
    public QQStateErrorException() {
        super();
    }

    public QQStateErrorException(String message) {
        super(message);
    }

    public QQStateErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public QQStateErrorException(Throwable cause) {
        super(cause);
    }

    protected QQStateErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
