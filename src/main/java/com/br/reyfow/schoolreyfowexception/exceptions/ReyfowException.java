package com.br.reyfow.schoolreyfowexception.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class ReyfowException extends RuntimeException{

    private final HttpStatus statusCode;

    private final  String message;

}
