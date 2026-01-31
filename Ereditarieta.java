import java.util.Scanner;

public class Ereditarieta {
    
    public static void main(String[] args) {  
        
        //dimostro_ereditarieta();
        ereditarieta_scelta();
    }      
    
    static void dimostro_ereditarieta () {
        
        Animali   mio_animale = new Animali();            
        Mammiferi mio_mammifero = new Mammiferi();
        
        mio_animale.var_mangiano    = "Gli animali mangiano";
        mio_animale.var_dormono     = "Gli animali dormono";
        mio_animale.var_tot_animali = 100;
        
        System.out.println("Gli Animali, lezione di SuperQuark:");
        
        mio_animale.animali_fanno(); 
        mio_animale.animali_tot();
                
        mio_mammifero.var_mamm_crts01   = "I mammiferi hanno ghiandole mammarie";
        mio_mammifero.var_mamm_crts02   = "I mammiferi hanno un sistema nervoso maggiormente sviluppato";
        mio_mammifero.var_mangiano      = "Non tutti sono carnivori";
        mio_mammifero.var_dormono       = "I cavalli non dormono sdraiati";
        mio_mammifero.var_tot_mammiferi = 45;
        mio_mammifero.var_tot_animali   = 1000;                      //provare a commentare questa assegnazione
        
        System.out.println("Osserviamo più attentamente i mammiferi:");
        
        mio_mammifero.mammiferi_sono();
        //mio_mammifero.mammiferi_fanno();                                                        // mio_mammifero.animali_fanno() e mio_mammifero.mammiferi_fanno() visualizzano entrambi le stesse variabili
        
        mio_mammifero.animali_fanno();
        
        mio_mammifero.non_mammiferi_tot();

    }
    
    static void ereditarieta_scelta () {
        // non definisco l'oggetto per la sottoclasse perché non so quale sia

        Animali animale_sconosciuto; 
        
        String var_tipo_animale;
        
        Scanner obj_input = new Scanner(System.in);
        
        System.out.println("Di quale animale vuoi le caratteristiche? Scegli tra Mammiferi o Rettili:");
        var_tipo_animale = obj_input.nextLine();
        
        if (var_tipo_animale.equalsIgnoreCase("mammiferi")) {
            
            animale_sconosciuto = new Mammiferi();
            
            animale_sconosciuto.var_dormono = "I cavalli non dormono sdraiati";
            animale_sconosciuto.var_mangiano = "Non tutti sono carnivori";
            
        } else if (var_tipo_animale.equals("Rettili")) {
            
            animale_sconosciuto = new Rettili();
            
            animale_sconosciuto.var_dormono = "Dormono strisciando";
            animale_sconosciuto.var_mangiano = "Mangiano di tutto";
        
        } else {
            
            animale_sconosciuto = new Animali();
            
            animale_sconosciuto.var_dormono = "dormono moltissime ore";
            animale_sconosciuto.var_mangiano = "mangiano quanto vorrei io";
            
        }

        animale_sconosciuto.animali_fanno();
    }
}