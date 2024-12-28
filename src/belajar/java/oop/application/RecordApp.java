package belajar.java.oop.application;

import belajar.java.oop.data.LoginRequest;

public class RecordApp {
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("Dyaz", "rahasia");

    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    System.out.println(loginRequest);

    System.out.println(new LoginRequest());
    System.out.println(new LoginRequest("Dyaz"));
    System.out.println(new LoginRequest("Dyaz", "rahasia"));
  }
}
