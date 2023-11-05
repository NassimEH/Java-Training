import java.util.*;

public class WordCounter{
  public static void main(String[] args){
    System.out.println("Entrez un paragraphe : ");
    Scanner scan = new Scanner(System.in);
    String paragraphe = scan.nextLine();
    paragraphe = paragraphe.trim();
    int count = 1;
    int i = 0;
    for(i = 0; i<paragraphe.length(); i++){
      if(paragraphe.charAt(i) == ' ' && paragraphe.charAt(i+1) != ' '){
        count++;
      }
    }
    System.out.println("Le nombre de mot dans le paragraphe est de : "+ count);
    scan.close();
  }
}