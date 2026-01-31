package md.corsojava;

class Messaggi3 {
    
     static String var_messaggio = "variabile static";
        
    static void primo_messaggio3 (){
        String var_messaggio31 = "Prova di primo messaggio 31";
   
        System.out.println ("    metodo primo_messaggio3 - Questo è un primo messaggio");
        System.out.println ("      var_messaggio31:" + var_messaggio31 + "<");                      //
        System.out.println ("      var_messaggio:" + var_messaggio + "<");                          //
        
               
    }

    public static void secondo_messaggio3 (){
    
        String var_messaggio32 = "Prova di secondo messaggio 32";
      
        System.out.println ("    metodo secondo_messaggio3 - Questo è un secondo messaggio");
        System.out.println ("      var_messaggio32:" + var_messaggio32 + "<");                      //
        System.out.println ("      var_messaggio:" + var_messaggio + "<");                          //
    
        var_messaggio = "cambio dentro al metodo";

        Messaggi3.primo_messaggio3();
    
    }
}

public class ProvaThisMetodo3 {
    public static void main (String args[]){
        System.out.println ("Classe ProvaThisMetodo3 - Inizio del programma"); 
        System.out.println ("*");
        
        //1
        Messaggi3.secondo_messaggio3();
        
        /*
        //2 effettuare una prova con var_messaggio
        Messaggi3.var_messaggio = "cambio la stringa";
        Messaggi3.secondo_messaggio3();
        */
        /*
        //3 effettuare una prova con oggetto di classe Messaggi3
        // creazione primo oggetto
        Messaggi3 miomessaggi3 = new Messaggi3();
        miomessaggi3.var_messaggio = "cambio la stringa - oggetto"; 
        miomessaggi3.secondo_messaggio3();
                
        
        //3bis effettuare una prova con 2 oggetti di classe Messaggi3
        Messaggi3 miomessaggi4 = new Messaggi3 ();
        miomessaggi4.var_messaggio = "cambio la stringa - oggetto 2";
        miomessaggi4.secondo_messaggio3(); 
        
        miomessaggi3.secondo_messaggio3();
        */
        /*
        //4 effettuare una prova con Messaggi2

        Messaggi3.secondo_messaggio3();
        */
        System.out.println ("*");
        System.out.println ("Classe ProvaThisMetodo3 - Fine del programma");
  }
}