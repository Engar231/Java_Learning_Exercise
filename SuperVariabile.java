package md.corsojava;

class SuperClasse {
    int i;
}

class SubClasse extends SuperClasse {
    int i;
    
    SubClasse (int a, int b) {
        super.i = a;                        // obbligatorio per stesso nome di variabile di classe oppure per chiarezza
              i = b;                        // posso mettere this per maggior comprensione
    }
    
    void MostraI() {
        System.out.println ("i di SuperClasse:" + super.i);  
        System.out.println ("i di SubClasse:" + this.i);        
    }
}

public class SuperVariabile {
    public static void main (String args[]){
        SubClasse miaSubclasse = new SubClasse(100, 50);
        miaSubclasse.MostraI(); 
    }
}