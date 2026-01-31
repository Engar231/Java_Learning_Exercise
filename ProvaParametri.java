package md.corsojava;

public class ProvaParametri {
    
    public static void main(String[] args) {
        
        int var_risultato;
        
        int var_primo_numero   = 2;
        int var_secondo_numero = 3;
        
        System.out.println("Prima della chiamata");
        System.out.println("    var_primo_numero vale  :" + var_primo_numero);    // 
        System.out.println("    var_secondo_numero vale:" + var_secondo_numero);  //

        var_risultato = dimostro_parametri(var_primo_numero, var_secondo_numero); // chiamata per valore

        System.out.println("Dopo la chiamata");
        System.out.println("    var_primo_numero vale  :" + var_primo_numero);     // 
        System.out.println("    var_secondo_numero vale:" + var_secondo_numero);   //
        System.out.println("         var_risultato vale:" + var_risultato);        //
               
    }
    
    public static int dimostro_parametri (int k, int m) { 
    
        int a, b;  
        
        a = k * 2;
        b = m / 2;
        m = m * 4;
        
        System.out.println("*");
        System.out.println("    Dentro dimostro_parametri");
        System.out.println("        k vale:" + k); //
        System.out.println("        m vale:" + m); //
        System.out.println("        a vale:" + a); //
        System.out.println("        b vale:" + b); //
        System.out.println("*");

        return m;
        
    }
    
}
