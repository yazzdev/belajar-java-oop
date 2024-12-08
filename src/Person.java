class Person {
  String name;
  String address;
  final String country = "Indonesia";

  Person(String name, String address){
    name = name;
    address = address;
  }

  Person(String name){
    this(name, null);
  }

  Person(){
    this(null);
  }

  void sayHello(String name) {
    System.out.println("Hello, " + name + " My name is " + name);
  }
}
