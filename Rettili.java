package md.corsojava;

// Rettili è una sottoclasse di Animali
class Rettili extends Animali {
    String var_rett_crts01;                 // caratteristiche dei rettili
    String var_rett_crts02;                 // caratteristiche dei rettili
    
    int var_tot_rettili;                    // numero totale dei rettili al mondo
        
    // visualizzo le caratteristiche dei mammiferi
    public void rettili_sono() {
        System.out.println(var_rett_crts01 + ". " + var_rett_crts02);
    } 
    
    //visualizzo quello che fanno gli animali
    @Override
    public void animali_fanno() {
        System.out.println(" in override - Ad alcuni fanno senso");
    }
}