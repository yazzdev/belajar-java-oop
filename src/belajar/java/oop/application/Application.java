package belajar.java.oop.application;

import belajar.java.oop.data.Product;

public class Application {
  public static void main(String[] args) {
    Product product = new Product("Mac Book Pro", 30_000_000);
    System.out.println(product.name);
    System.out.println(product.price);
  }
}