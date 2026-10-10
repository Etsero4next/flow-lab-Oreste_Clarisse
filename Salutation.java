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
    System.out.println(saluer("Emile", "es"));
  }

static String saluer(String nom, String langue) {
    if ("fr".equals(langue)) {
        return "Bonjour, " + nom + " !";
    } else if ("en".equals(langue)) {
        return "Hello, " + nom + "!";
    } else if ("es".equals(langue)) {
        return "Hola, " + nom + "!";
    } else {
        return "Langue non prise en charge.";
    }
}
}
