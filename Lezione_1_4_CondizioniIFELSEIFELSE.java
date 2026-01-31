public class Lezione_1_4_CondizioniIFELSEIFELSE
{
    public static void main(String[] args) 
    {
        // Sintassi della if
        // if(condizione) {
        //     istruzione da eseguire se la condizione della if è VERA;
        // }
        // condizione ? espressione vera : espressione falsa
        /*
    var_sconto = (var_sconto_da_applicare != 0) 
    ? "Lo sconto è applicabile ed è del: " + var_sconto_da_applicare + "%" 
    : "Non ci sono sconti";
    */


        String var_sconto = "\nNon ci nne sconti";
        int var_sconto_da_applicare = 10;
        //fosse 0 passa diretto all'ELSE
        System.out.println("\nPrima della if - Sconto e Non Sconto, questo e' il dilemma");
        if (var_sconto_da_applicare != 0) {
            // Eseguo questo blocco solo se la condizione è vera
            var_sconto = "Lo sconto applicabile e' del: " + var_sconto_da_applicare + "%";
        } 
        else if (var_sconto_da_applicare == 10)//elif di Python
        {
            var_sconto = "Bravo, Hai Raggiunto un traguardo. Ecco una medaglia";
        }
        else //Se IF non va, va qui 
        {
            var_sconto = "Lo sconto non è applicabile, me spiase";
        }

        System.out.println(var_sconto);

        double var_importo;
        double var_spesedispedizione;
        var_importo = 50;
        System.out.println("Prima di if - Import e Spedizione");
        if (var_importo > 60)
        {
            var_spesedispedizione = 0;
            System.out.println("Spedizione Gratuita");
        }
        else if (var_importo == 50)
        {
            var_spesedispedizione = 5.0;
            System.out.println("Le spede di spedizioni sono scontate del: " + var_spesedispedizione + " %");
        }
        else
        {
            var_spesedispedizione=10.0;
            System.out.println("Che cosa vuoi?!?! Vattene pezzente e devi pagare la spedizione." + var_spesedispedizione);
        }
//Esercizio 1 giorno 5
        int puntitessera = 91;

        System.out.println("Esercizio giorno 5\nBenvenuti a Lidlo delle donne");
        if (puntitessera == 0)
        {
        System.out.println("Sei un nuovo utente, per te non c' e' nulla che possiamo darti. Puoi solo pagare e sottoscrivere alle nostre regole");
        }
        else if (puntitessera >= 90)
        {
        System.out.println("Non hai una vita sociale? Spendi tutto qua. Complimenti. Hai in omaggio un pacco di pasta da 125 grammi");
        }
        else if (puntitessera >=15 && puntitessera <= 41)
        {
        System.out.println("Wow, sei proprio uno spendaccione, per te uno sconto del 2%");
        }
        else if (puntitessera >= 10 && puntitessera  <= 15)
        {
        System.out.println("Sei un universitario vero? Si vede. Sennò sei un pezzente.");
        }
        else if (puntitessera == 10)
        {
        System.out.println("Sei nuovo, cerca di spendere entro una settimana! senno' non venire piu'");
        }
        else 
        {
        System.out.println("Non so cosa dirti.. bravo!");
        }
        System.out.println("Punti caricati..");
//esercizio 2 del giorno 5
        System.out.println("Esercizio Studente - 4 voti sopra il 6 , promosso");
        String studente2 = "Calogero";
        int matematica2 = 6;
        int storia2 = 6;
        int fisica2 = 6;
        int scienze2 = 6;

        int contatore2 = 0;

        if (matematica2 >= 6) contatore2 = contatore2 + 1;
        if (storia2 >= 6) contatore2 = contatore2 + 1;
        if (fisica2 >= 6) contatore2 = contatore2 + 1;
        if (scienze2 >= 6) contatore2 = contatore2 + 1;

        if (contatore2 >= 4)
            System.out.println("Promosso " + studente2);
        else
            System.out.println("Bocciato " + studente2);

        System.out.println("Esercizio Studente - Media uguale a 8 promosso");
        String studente = "Genoveffo";
        String messaggio = "Inserire un messaggio";
        double storia = 9, matematica = 9, informatica = 6, inglese = 4, edfisica = 6;
        double somma = storia + matematica + informatica + inglese + edfisica;
        int numMaterie = 5;
        double media = somma / numMaterie;
        if (media <= 8)
        {
        messaggio = "Bocciato, babbo. " +studente;
        }
        else if (media >= 8)
        {
        messaggio = "Promosso " +studente;
        }
        else 
        {
        messaggio = "Ci sei andato a sQuola? " +studente;
        }
        System.out.println(messaggio);
        System.out.println("Esercizio Studente - Promosso con 2 voti a 6");
        String studente1 = "Papareddu";
        int matematica1 = 6;
        int storia1 = 6;
        int fisica1 = 4;
        int scienze1 = 3;

        int contatore = 0;

        if (matematica1 >= 6) contatore = contatore + 1;
        if (storia1 >= 6) contatore = contatore + 1;
        if (fisica1 >= 6) contatore = contatore + 1;
        if (scienze1 >= 6) contatore = contatore + 1;

        if (contatore >= 2)
            System.out.println("Promosso " + studente1);
        else
            System.out.println("Bocciato " + studente1);
//Potevamo fare anche boolean risultati;
//risultato = { e mettevamo voto[0] > 6 | voto [1] > 6 etc etc } Array version.
    }
}

