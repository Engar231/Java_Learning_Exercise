package md.corsojava;

class Messaggi2 {
    
  static void primo_messaggio2 (){
      System.out.println ("    metodo primo_messaggio2 - Questo è un primo messaggio");    
  }

  static void secondo_messaggio2 (){
      System.out.println ("    metodo secondo_messaggio2 - Questo è un secondo messaggio"); 
      Messaggi2.primo_messaggio2();
  }
}

public class ProvaThisMetodo2 {
  public static void main (String args[]){
    System.out.println ("Classe ProvaThisMetodo2 - Inizio del programma");  
    System.out.println ("*");                                               
        
    Messaggi2.secondo_messaggio2();
    
    System.out.println ("*");
    System.out.println ("Classe ProvaThisMetodo2 - Fine del programma");
  }
}