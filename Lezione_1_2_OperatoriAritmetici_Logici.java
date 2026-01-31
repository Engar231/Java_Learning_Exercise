public class Lezione_1_2_OperatoriAritmetici_Logici //Operatori Aritmetici di base e non.
{ 
    public static void main(String[]args)
{
    int var_somma = 1+1;
    int var_moltiplicazione = var_somma * 3;
    //int var_divisione = var_moltiplicazione / 4; 
    //funziona lo stesso ma con int perde la parte decimale, fondamentale      
    double var_divisione = var_moltiplicazione / 4f; //essendo un numero decimale, va dichiarato come double o float
    double var_sottrazione = var_somma - var_divisione; //anche qui, si perde int perché ormai è decimale.
    double var_segno = -var_sottrazione; //Dichiarare il negativo, a differenza di Python serve farlo.
    System.out.println("Il risultato della somma e': " + var_somma);
    System.out.println("Il risultato della moltiplicazione e': " + var_moltiplicazione);
    System.out.println("Il risultato della divisione e': " + var_divisione);
    System.out.println("Il risultato della sottrazione e': " + var_sottrazione);
    System.out.println("Il risultato del segno e': " + var_segno);
    System.out.println("__________Fine Spiegazione Operatori Aritmetici di base.__________");
//esercizio 1.21
    int a=5+8;
    int b=a-8;
    int c=b*3;
    double d=c/4;
//joke esercizio 1.21
    int ditamano=10;
    int botti=3;
    float capodanno=ditamano/botti;
    System.out.println("Il risultato finale e': " + d);
    System.out.println("La tua mano dopo capodanno e' composta da " + capodanno + " dita");
    System.out.println("__________Fine Esercizio 1.21__________"); 
//controllo +=, -=, *=, /= onde evitare di riscrivere la variabile.
    int a1=10;
        a1 +=5; //equivale a a1=a1+5
    System.out.println("Il valore di a1 e': " + a1);
    System.out.println("__________Fine spiegazione controllo +=, -=, *=, /=__________");
//modulo (resto della divisione)%
    double modulo = 5 % 2; //5 diviso 2 fa 2, resto 1
    System.out.println("Il risultato del modulo e': " + modulo);
    System.out.println("__________Fine spiegazione modulo %__________");
//incremento e decremento ++ e --, equivale a +1 o -1, cioé x++ = x=x+1 che da 5 passa a 6.
    byte x = 5; //byte per numeri piccoli, che non superano 127 (o -128 se negativo), perché occupa meno memoria.
//dove si usa byte? Nelle immagini, nei video, nei suoni, ecc.
        x++; //equivale a x=x+1
    System.out.println("Il valore di x dopo l'incrementale (++) e': " + x);
    System.out.println("__________Fine spiegazione incremento e decremento ++ e --__________");
//operatori di confronto (relazionali)
    int var1 = 10;
    int var2 = 20;
    String parola1 = "Ciao";
    String parola2 = "Java";
    System.out.println("var1 "  +var1+ " e' uguale a var2 "  +var2+ " ? " + (var1 == var2)); //false
    System.out.println("var1 e' diverso da var2 ? " + (var1 != var2)); //true
    System.out.println("var1 e' maggiore uguale di var2 ? " + (var1 >= var2)); //false
    System.out.println("var1 e' minore uguale di var2 ? " + (var1 <= var2)); //true
    System.out.println("parola1 e' uguale a parola2 ? " + (parola1.equals(parola2))); //false
    System.out.println("parola1 e' diverso da parola2 ? " + (!parola1.equals(parola2))); //true
    System.out.println("parola1 e' uguale a 'Ciao' ? " + (parola1.equals("Ciao"))); //true 
    System.out.println("parola2 e' uguale a 'Java' ignoranzo le maiuscole ? " + (parola2.equalsIgnoreCase("java"))); //True
    //equalsIgnoreCase ignora le maiuscole, quindi Java e java sono uguali.
    System.out.println("parola2 e' uguale a 'Java' ? " + parola2==parola1); //false
    //con le stringhe non si usa == ma .equals. Nel terminale troveremo false, senza quello che abbiamo scritto nel print   
    System.out.println("_________Fine spiegazione operatori di confronto (relazionali)__________");
//operatori logici (AND, OR, NOT etc etc)
//& e && sono entrambi AND, ma && è più usato. & si usa per i bit oltre cose più complesse, tipo bitwise ecc.
//| e || sono entrambi OR, ma || è più usato. | si usa come per and su.
//! è Not, cioé nega la condizione.
//!= significa diverso. come su Python
    boolean condizione1 = true; 
    boolean condizione2 = false;
    int x2,x3,x4;
        x2 = 5;
        x3 = 10;
        x4 = 5;
    System.out.println("or(|) singola, detto logico " + (x2 <  x3 | x3 < x4 )); //true
    //si ferma al primo vero, fosse doppio invece controlla tutto.
    System.out.println("and(&) singola detto logico" + (x2 > x3 & x3 > x4 )); //false
    //si ferma al primo falso, fosse doppio invece controlla tutto.       
    System.out.println("condizione1 and(&&) condizione2 ? " + (condizione1 && condizione2)); //false
    System.out.println("condizione1 and(&) condizione2 ? " + (condizione1 & condizione2)); //false
    System.out.println("condizione1 and(&=) condizione2 ? " + (condizione1 &= condizione2)); //false
    System.out.println("condizione1 or(||) condizione2 ? " + (condizione1 || condizione2)); //true
    System.out.println("condizione1 or(|) condizione2 ? " + (condizione1 | condizione2)); //true
    System.out.println("not(!) condizione1(true)/condizione2(false) ? " + (!condizione1) + "/" + (!condizione2)); //falsetrue perché una parte da false 

    }
}
