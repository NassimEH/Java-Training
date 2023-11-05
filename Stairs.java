import java.util.*;

public class Stairs{
  public static void main(String[] args){
    System.out.println("Combien il y aura d'escaliers ?");
    Scanner scan = new Scanner(System.in);
    int nbEscaliers = scan.nextInt();
    System.out.println("De quelle taille seront ces escaliers ?");
    int tailleEscaliers = scan.nextInt();
    for(int i = 0; i<nbEscaliers; i++){
      for(int j = 0; j<(i+1)*tailleEscaliers; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
    for(int i = 4; i>=0; i--){
      for(int j = 0; j<(i+1)*tailleEscaliers;j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
    scan.close();
  }
}