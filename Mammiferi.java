package md.corsojava;

// Mammiferi è una sottoclasse di Animali
class Mammiferi extends Animali {
    
    String var_mamm_crts01;                 // caratteristiche dei mammiferi
    String var_mamm_crts02;                 // caratteristiche dei mammiferi
    
    int var_tot_mammiferi;                  // numero totale dei mammiferi al mondo
        
    // visualizzo le caratteristiche dei mammiferi
    public void mammiferi_sono() {
        System.out.println("Sono nel metodo della subclasse Mammiferi, mammiferi_sono - " + var_mamm_crts01 + ". " + var_mamm_crts02);
    }        
    
    // visualizzo quello che fanno gli animali
    // var_mangiano e var_dormono sono della superclasse
    public void mammiferi_fanno() {
        
        System.out.println("Sono nel metodo della subclasse Mammiferi, mammiferi_fanno - " + var_mangiano + ". " + var_dormono);
        animali_fanno();
    }
    
    // calcolo e visualizzo il numero totale di animali NON mammiferi
    public void non_mammiferi_tot() {
        System.out.println("Sono nel metodo della subclasse Mammiferi non_mammiferi_tot - Al mondo ci sono " + (var_tot_animali - var_tot_mammiferi) + " animali non mammiferi.");
    } 
        
    // visualizzo quello che fanno gli animali
    @Override
    public void animali_fanno() {
        System.out.println("Sono nel metodo della subclasse in override - " + var_mangiano + ". " + var_dormono);
        //System.out.println("Sono dei pelandroni!!!");
        //System.out.println(var_mangiano + ". " + var_dormono);
    }
}