public class Contenitore {
    
    //variabili di classe
    double larghezza;
    double altezza;
    double profondita;

    // costruttore in caso le dimensioni non siano specificate
    Contenitore () {
         larghezza = -1;
           altezza = -1;
        profondita = -1;
    }
    
    // definisco il costruttore con tutti i parametri 
    // per tutte le variabili della classe
    Contenitore (double largh, double alt, double prof) {
         larghezza = largh;            
           altezza = alt;              
        profondita = prof;       
    }
        
    // definisco il costruttore per un cubo
    Contenitore (double dimensione) {
         larghezza = altezza = profondita = dimensione;
    }
    
    // definisco il costruttore per un cubo
    // un po' sciocco perché c'è già double
    Contenitore (int lato) {
         larghezza = altezza = profondita = lato;
    }
    
    // definisco il costruttore per un 2D
    Contenitore (double larg, double alt) {
         larghezza = larg;
           altezza = alt; 
    }

    Contenitore (char tipo) {
        if (tipo == 's') {
             larghezza = 11.55;
               altezza = 48.33;
            profondita = 14.23;
        } else if (tipo == 'm') {
            larghezza = altezza = profondita = 20;
        }
    }
    
    // calcolo l'area di Contenitore con le variabili di classe
    public double area(){
        return larghezza * altezza;
    }
    
    // calcolo il volume di Contenitore con le variabili di classe
    public double vol(){
        return larghezza * altezza * profondita;
    }
 
}