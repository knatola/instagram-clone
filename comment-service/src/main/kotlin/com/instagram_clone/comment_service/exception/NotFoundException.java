package com.instagram_clone.comment_service.exception;

public class NotFoundException extends Exception {

  public NotFoundException(String message) {
    super(message);
  }

  public NotFoundException(String message, Exception cause) {
    super(message, cause);
  }
}
