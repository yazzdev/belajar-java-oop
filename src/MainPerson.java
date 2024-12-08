public class MainPerson {
  public static void main(String[] args) {

    var person1 = new Person();
    person1.name = "Dyaz";
    person1.address = "Jakarta";
    // person1.country = "Amerika"; final field

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Eko");

    Person person2 = new Person();

    Person person3;
    person3 = new Person();
    person3.name = "Sinta";
    person3.sayHello("Dyaz");
  }
}