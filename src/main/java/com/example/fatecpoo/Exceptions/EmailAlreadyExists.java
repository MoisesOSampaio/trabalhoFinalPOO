package com.example.fatecpoo.Exceptions;

public class EmailAlreadyExists extends RuntimeException {
    public EmailAlreadyExists(String message) {
        super(message);
    }

    public EmailAlreadyExists() {
    super();
  }
}
