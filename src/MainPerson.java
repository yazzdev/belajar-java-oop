public class MainPerson {
  public static void main(String[] args) {

    var person1 = new Person("Dyaz", "Jakarta");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Eko");

    Person person2 = new Person("Budi", "Bandung");

    Person person3;
    person3 = new Person("Sinta", "Banten");
    person3.sayHello("Dyaz");
  }
}