// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.

import java.time.LocalTime;

public class Salutation {

  public static void main(String[] args) {
    System.out.println(saluer("user"));
  }

  static String saluer(String nom) {
     
    return "Hello, " + nom + "!";
  }
  public static void saluer() {
     int heure = LocalTime.now().getHour();

        if (heure < 12) {
            System.out.println("Bonjour !");
        } else if (heure < 18) {
            System.out.println("Bon après-midi !");
        } else {
            System.out.println("Bonsoir !");
        }
  }

}
