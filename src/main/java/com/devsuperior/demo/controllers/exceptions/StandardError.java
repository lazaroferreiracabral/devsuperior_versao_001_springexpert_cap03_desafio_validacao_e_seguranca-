package com.devsuperior.demo.controllers.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@Data
public class StandardError {

    private Instant timestamp;

    private Integer status;

    private String error;

    private String message;

    private String path;
}
