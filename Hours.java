import java.util.*;

public class Hours{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    
    System.out.println("Quelle est l'heure ? ");
    int heureActuelle = scan.nextInt();
    System.out.println("Quelle est la minute ? ");
    int minuteActuelle = scan.nextInt();
    System.out.println("Quelle est la seconde ? ");
    int secondeActuelle = scan.nextInt();

    System.out.println("Très bien, il est " + heureActuelle + "H" + minuteActuelle + ":" + secondeActuelle);

    System.out.println("De combien d'heures voulez vous avancer ? ");
    int heureAvancee = scan2.nextInt();
    System.out.println("De combien de minutes ? ");
    int minuteAvancee = scan2.nextInt();
    System.out.println("De combien de secondes ? ");
    int secondeAvancee = scan2.nextInt();

  System.out.println("Très bien... Chargement de l'heure nouvelle...");

    boolean nouveauJour = false;
    int minuteExtraite = 0;
    int heureExtraite = 0;

    int nouvelleSeconde = secondeActuelle + secondeAvancee;
    if(nouvelleSeconde > 60){
      nouvelleSeconde -= 60;
      minuteExtraite = 1;
    } 
    
    int nouvelleMinute = minuteActuelle + minuteAvancee + minuteExtraite;
    
    if(nouvelleMinute > 60){
      nouvelleMinute -= 60;
      heureExtraite = 1;
    } 
    
    int nouvelleHeure = heureActuelle + heureAvancee + heureExtraite;
    
    if(nouvelleHeure > 24){
      nouveauJour = true;
      nouvelleHeure -= 24;
    }else{
       System.out.println("Très bien, il est maintenant " + nouvelleHeure + "H" + nouvelleMinute + ":" + nouvelleSeconde);
    }
    scan.close();
    scan2.close();
}
}