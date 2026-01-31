public class Lezione_1_9_Contenitore 
{
    double altezza; 
    double larghezza; //Possiamo mettere privati i dati aggiungendo private prima di double
    double profondita;
    Lezione_1_9_Contenitore(double alt,double larg,double vol)
    {
        altezza = alt;
        larghezza = larg;
        profondita = vol;
    }
        public double area()
    {
        return larghezza * altezza;
    }
    public double vol()
    {
        return larghezza * altezza * profondita;
    }
    static class ContenitoreDemo
    {
        public static void main(String[] args) 
        {
            Lezione_1_9_Contenitore miocontenitore = new Lezione_1_9_Contenitore(23,67,7);
            Lezione_1_9_Contenitore miocontenitore2 = new Lezione_1_9_Contenitore(10,25,8);
            System.out.println("Mio Larg: " +miocontenitore.larghezza);
            System.out.println("Mio Alt: " +miocontenitore.altezza);
            System.out.println("Mio Prof: " +miocontenitore.profondita);
            System.out.println("Mio2 Alt: " +miocontenitore2.altezza);
            System.out.println("Mio2 Larg: " +miocontenitore2.larghezza);
            System.out.println("Mio2 Prof: " +miocontenitore2.profondita);
            System.out.println("Mio2 Area: " +miocontenitore2.area());
            System.out.println("Mio Area: " +miocontenitore.area());
        }
    }
}