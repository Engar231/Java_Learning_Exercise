public class Lezione_1_3_OperatoriLogiciXOR
{
    public static void main(String[]args)
{
//Operatore logico XOR(^)
    boolean var1 = true;
    boolean var2 = false;
    System.out.println("Il risultato di var1 XOR var2 e': " + (var1 ^ var2)); //true
    System.out.println("Il risultato di var1 XOR var1 e': " + (var1 ^ var1)); //false
    System.out.println("Il risultato di var2 XOR var2 e': " + (var2 ^ var2)); //false
    System.out.println("Il risultato di var2 XOR var1 e': " + (var2 ^ var1)); //true
    System.out.println("__________Fine spiegazione operatore logico XOR (^)__________");
//Lo XOR se sono due true o due false, il risultato è false. Se uno è true e l'altro false, il risultato è true.
//operatore logico ?:
    int numero = 15;
    String risultato; 
    risultato = (numero % 2 == 0) ? "Il numero e' pari" : "Il numero e' dispari";
    System.out.println("Il risultato dell'operatore logico ? e' : " + risultato);
    int var_sconto = 10;
    String var_messaggio;
    var_messaggio = (var_sconto > 0) ? "Hai uno sconto del " + var_sconto + "%" : "Non hai sconti disponibili";
    System.out.println(var_messaggio);
    System.out.println("__________Fine spiegazione operatore logico ?:__________");
//L'operatore logico ?: valuta una condizione e restituisce un valore se la condizione è vera e un altro valore se la condizione è falsa.
//cioè una forma compatta di un'istruzione if-else, usata per singole assegnazioni o espressioni.
    double tot_carrello = 120.50;
    int sconto_scaglione1 = 70;
    int sconto_scaglione2 = 140;
    double prezzo_finale = (tot_carrello >= sconto_scaglione2) ? 
                            (tot_carrello -50) ://: significa altrimenti.
                            (tot_carrello >= sconto_scaglione1) ? 
                            (tot_carrello -20) : tot_carrello;
    System.out.println("Il prezzo finale del carrello e': " + prezzo_finale);


//Esercizio giorno 4
//Calcola area quadrato e mostralo a video
    double lato = 10.0;
    double area_quadrato = lato * lato;
    System.out.println("L'area del quadrato e': " + area_quadrato + "cm^2");
//Calcola area rettangolo e moostralo a video
    double base = 12.5;
    double altezza = 8.90;
    double area_rettangolo = base * altezza;
    System.out.println("L'area del rettangolo e': " + area_rettangolo + "cm^2"); 
//confronta area quadrato e rettangolo e mostra quale e' piu' grande
    String confronto_aree = (area_quadrato > area_rettangolo) ? 
                            "L'area del quadrato e' piu' grande " : 
                            (area_quadrato < area_rettangolo) ? 
                            "L'area del rettangolo e' piu' grande " : 
                            "Le aree sono uguali";
    System.out.println(confronto_aree);
//In Boolean, mostra true se l'area del quadrato e' maggiore di quella del rettangolo, altrimenti false

}
}
