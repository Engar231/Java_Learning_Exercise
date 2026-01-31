public class Lezione_1_LaBaseArray //Char,String, Println, funzioni base per iniziare a scrivere su Java
{
    public static void main(String[] args) {
        //int b,a,area; possiamo farlo anche così
           // b=10;
           // a=2;
           // area=b*a;

        int b=10;
        int a=2;
        int area=100;
        System.out.println("Hello World!");
        System.out.println("altezza e' uguale a " + a);
        System.out.println("area e' uguale a " + area);
        System.out.println("base e' uguale a " + b);
        System.out.println("la somma dei tre e' di  " + (area + a + b));
//versione 1.1 - Array giorni mesi versione newbie
        char giorni_mesi [];
             giorni_mesi = new char[30];
             giorni_mesi[0]='1';
             giorni_mesi[1]='2';
             giorni_mesi[2]='3';
             giorni_mesi[3]='4';
//possiamo fino al 30, che sarebbe poi giorno 31. Ma non ho voglia
        System.out.println("il primo giorno del mese e' " + giorni_mesi[0]);
//versione 1.2 - array giorni mesi versione mid usando string anziché char, questo permetterà di leggere una lista
        String giorni_mesi_v2 [] = {
            "1","2","3","4","5","6","7","8","9","10", //lista dei numeri
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30"};
        System.out.println("il secondo giorno del mese e' " + giorni_mesi_v2[1]);
//versione 1.3 - array mesi string version    
        String mesi [] = {
                        "Gennaio", 
                        "Febbraio", 
                        "Marzo", 
                        "Aprile", 
                        "Maggio", 
                        "Giugno", 
                        "Luglio", 
                        "Agosto", 
                        "Settembre", 
                        "Ottobre", 
                        "Novembre", 
                        "Dicembre"
                    };
        System.out.println("Il mese corrente e' " + mesi[3]);
//nome e cognome in array, selezionando il nome o cognome con l'indicem dell'array. [0]=nome [1]=cognome
        String nome_cognome [] = {"Alfio Ezechiele", "Cavallaro"};
        System.out.println("Il mio nome e' " + nome_cognome[0] + " e il mio cognome e' " + nome_cognome[1]);
    }
}