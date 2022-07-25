package com.br.reyfow.schoolreyfowexception.dto;

import lombok.Builder;
import org.springframework.http.HttpStatus;


@Builder
public class ResponseErrorDTO {

    private HttpStatus code;
    private String message;
}
