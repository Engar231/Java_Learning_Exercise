class Animali {
        
    String var_mangiano;
    String var_dormono;
    
    int var_tot_animali; 
    
    // visualizzo quello che fanno gli animali
     void animali_fanno(){
        System.out.println("Sono nel metodo della superclasse animali_fanno - " + var_mangiano + ". " + var_dormono);
    } 
   
    // visualizzo il numero totale di animali
    void animali_tot() {
        System.out.println("Sono nel metodo della superclasse animali_tot - Al mondo ci sono " + var_tot_animali + " animali");
    }    
    
    
    /*
    // override con parametri?
    public int over_param(int p_test1, int p_test2){
        System.out.println(p_test1 + ". " + p_test2);
        return p_test2;
    }
   */
}