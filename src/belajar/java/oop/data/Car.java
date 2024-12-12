package belajar.java.oop.data;

public interface Car extends HashBrand, IsMaintenance {

  void drive();

  int getTier();

  default boolean isBig(){
    return false;
  }

}
