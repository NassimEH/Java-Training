import java.util.*;

class VehicleInsurance {
  public static void main(String[] args) {
  System.out.println("Quel véhicule possédez-vous ? ");
  System.out.println("Choix : Voiture, Camion, Bus, Moto");
  Scanner scan = new Scanner(System.in);
  String choixVehicule = scan.nextLine();
  int tarifAssurance = 0;
  switch(choixVehicule){
    case "Voiture":
      tarifAssurance = 100;
      break;
    case "Camion":
      tarifAssurance = 200;
      break;
    case "Bus":
      tarifAssurance = 300;
      break;
    case "Moto":
      System.out.println("Quelle puissance à votre moto ?");
      System.out.println("Faible (1), Moyenne (2), Forte (3)");
      String puissanceMoto = scan.nextLine();
      int puissanceMotoInt = Integer.parseInt(puissanceMoto);
      switch(puissanceMotoInt){
        case 1 : 
          tarifAssurance = 100;
          break;
        case 2 :
          tarifAssurance = 200;
          break;
        case 3 : 
          tarifAssurance = 300;
          break;
        default : 
          System.out.println("Puissance non reconnue");
      }
  }
    System.out.println("Votre assurance vous coûtera : " + tarifAssurance +"€");
  }
}