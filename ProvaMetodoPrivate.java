package md.corsojava;

public class ProvaMetodoPrivate {

    public static void main(String[] args) {
        
        int variabile;
        
        ProvaMetodo.metodo_pubblico(); //accesso in modo diretto
        //classe.nomeMetodo();
        
        variabile = ProvaMetodo.metodo_con_parametri(3, 2);

        ProvaMetodo mio_prova_metodo = new ProvaMetodo();
        mio_prova_metodo.metodo_no_static(); // accesso in copia
        //nomeOggetto.nomeMetodo();
    }
    
}
