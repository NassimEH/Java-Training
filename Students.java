import java.util.Scanner;

public class Students {
  public static void main(String[] args) {
    System.out.println("Combien il y a d'étudiants dans la classe ? : ");
    Scanner scan = new Scanner(System.in);
    int nbEtudiants = scan.nextInt();

    String[] nomEtudiants = new String[nbEtudiants + 1];
    int[] ageEtudiants = new int[nbEtudiants + 1];

    Scanner scanAge = new Scanner(System.in);
    Scanner scanNom = new Scanner(System.in);

    for (int i = 1; i <= nbEtudiants; i++) {
      System.out.println("Quel est le nom de l'étudiant n°" + i + "?");
      nomEtudiants[i] = scanNom.nextLine();
      System.out.println("Quel est son âge ?");
      ageEtudiants[i] = scanAge.nextInt();
    }

    System.out.println("Fin du recensement");

    for (int i = 0; i < nbEtudiants; i++) {
      if (ageEtudiants[i] >= 18) {
        System.out.println("L'étudiant " + nomEtudiants[i] + " qui a " + ageEtudiants[i] + " ans est majeur");
      }
    }
    scan.close();
    scanAge.close();
    scanNom.close();
  }
}
