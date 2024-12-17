package belajar.java.oop.utils;

import belajar.java.oop.data.LoginRequest;
import belajar.java.oop.error.BlankException;
import belajar.java.oop.error.ValidationException;

public class ValidationUtil {
  public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
    if (loginRequest.username() == null) {
      throw new NullPointerException("Username is null");
    } else if (loginRequest.username().isBlank()) {
      throw new ValidationException("Username is blank");
    } else if (loginRequest.password() == null) {
      throw new NullPointerException("Username is null");
    } else if (loginRequest.password().isBlank()) {
      throw new ValidationException("Username is blank");
    }
  }

  public static void validateRuntime(LoginRequest loginRequest) {
    if (loginRequest.username() == null) {
      throw new NullPointerException("Username is null");
    } else if (loginRequest.username().isBlank()) {
      throw new BlankException("Username is blank");
    } else if (loginRequest.password() == null) {
      throw new NullPointerException("Username is null");
    } else if (loginRequest.password().isBlank()) {
      throw new BlankException("Username is blank");
    }
  }
}
