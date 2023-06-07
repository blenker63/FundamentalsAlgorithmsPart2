package com.prosky.fundamentalsalgorithmspart2.service;

public class ElementMissingException extends RuntimeException {
    public ElementMissingException(String massage) {
        super(massage);
    }
}
