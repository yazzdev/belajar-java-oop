public class ManagerApp {
  public static void main(String[] args) {
    var manager = new Manager();
    manager.name = "Dyaz";
    manager.sayHello("Sinta");

    var vp = new VicePresident();
    vp.name = "Joko";
    vp.sayHello("Budi");
  }
}
