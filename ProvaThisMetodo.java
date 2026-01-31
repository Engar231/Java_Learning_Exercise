package md.corsojava;

class Messaggi {
    
    String var_messaggio = "variabile NON static";    
    
    void primo_messaggio (){
        System.out.println ("    metodo primo_messaggio - Questo è un primo messaggio");   //
        System.out.println ("      var_messaggio:" + var_messaggio + "<");                 //
    }

    void secondo_messaggio (){
        System.out.println ("    metodo secondo_messaggio - Questo è un secondo messaggio"); //
        System.out.println ("      var_messaggio:" + var_messaggio + "<");                   //
        
        //var_messaggio = "cambio in metodo";   
        
        primo_messaggio();  
    }
}

public class ProvaThisMetodo {
  public static void main (String args[]){
      System.out.println ("Classe ProvaThisMetodo - Inizio del programma");             //
      System.out.println ("*");                                                         //
            
      Messaggi miomessaggio = new Messaggi();                                   
      miomessaggio.var_messaggio = "cambio in oggetto 1";                     
      miomessaggio.secondo_messaggio();      
      
      Messaggi miomessaggio2 = new Messaggi();                                  
      miomessaggio2.secondo_messaggio();                                        
      
      System.out.println ("*");                                                         //
      System.out.println ("Classe ProvaThisMetodo - Fine del programma");               //
  }
}