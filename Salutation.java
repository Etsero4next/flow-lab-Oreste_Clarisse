// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.
public class Salutation {

  public static void main(String[] args) {
    System.out.println(saluer("user"));
  }

  static String saluer(String nom) {
    // TODO: chaque membre du groupe ajoute ICI sa salutation, dans sa propre branche.
    return "Hello, " + nom + "!";
  }
  public static void main(String[] args) {
    System.out.println(saluer("Oreste", "fr"));
    System.out.println(saluer("John", "en"));
    System.out.println(saluer("Juan", "es"));
  }

  static String saluer(String nom, String langue) {
    if (langue.equals("fr")) {
      return "Bonjour, " + nom + " !";
    } else if (langue.equals("en")) {
      return "Hello, " + nom + "!";
    } else if (langue.equals("es")) {
      return "Hola, " + nom + "!";
    } else {
      return "Hello, " + nom + "!";
    }
  }
}
