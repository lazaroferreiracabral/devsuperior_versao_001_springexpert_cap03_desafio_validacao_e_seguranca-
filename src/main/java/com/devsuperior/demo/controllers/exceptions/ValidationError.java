package com.devsuperior.demo.controllers.exceptions;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    @Getter
    private List<FiledMessage> errors = new ArrayList<>();

    public void addError(String fieldName, String message) {
        errors.add(new FiledMessage(fieldName, message));
    }
}
