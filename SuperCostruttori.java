package md.corsojava;

/**
 *  Dimostrazione di come vengono chiamati i costruttori nel caso si abbiano
 *  SuperClassi e sottoclassi
 */ 

// definizione di una superclasse
class SuperClasseA {
    SuperClasseA () {
        System.out.println("Sono all'interno del costruttore della SuperClasseA"); //
    }
}

// definizione della sottoclasse SubClasseB, la cui super classe è SuperClasseA
class SubClasseB extends SuperClasseA {
    SubClasseB () {
        System.out.println("Sono all'interno del costruttore della SubClasseB"); // 
    }    
}

// definizione della sottoclasse SubClasseC, la cui super classe è SubClasseB
class SubClasseC extends SubClasseB {
    SubClasseC () {
        System.out.println("Sono all'interno del costruttore della SubClasseC"); //
    }
}

public class SuperCostruttori {
    public static void main(String[] args) {   
        SubClasseC c = new SubClasseC();
    }
}
