class Person {
  String name;
  String address;
  final String country = "Indonesia";

  Person(String paramName, String paramAdddress){
    name = paramName;
    address = paramAdddress;
  }

  void sayHello(String parmName) {
    System.out.println("Hello, " + parmName + " My name is " + name);
  }
}
