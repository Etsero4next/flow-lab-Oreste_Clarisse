// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.

import java.time.LocalTime;

public class Salutation {

  public static void main(String[] args) {
    saluer("user");
  }
 
  public static void saluer(String nom) {
    int heure = LocalTime.now().getHour();

    if (heure < 12) {
      System.out.println("Bonjour, " + nom + " !");
    } else if (heure < 18) {
      System.out.println("Bon après-midi, " + nom + " !");
    } else {
      System.out.println("Bonsoir, " + nom + " !");
    }
  }
}