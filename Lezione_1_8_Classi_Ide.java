public class Lezione_1_8_Classi_Ide
{
/* 
*
* author @ Alfio (Quando si scrive o si fa modifiche) 11/11/25
*
*
Simulazione di classi, com'è gestita e come funziona e si usa.
nel 10/11/25 ha spiegato anche gli IDE (Envoirement di sviluppo, tipo visual studio)
Java	🟢 NetBeans, IntelliJ IDEA, Eclipse (NetBeans più usato)
Python	🟣 PyCharm, VS Code, Spyder (PyCharm più usato)
C / C++	Visual Studio, Code::Blocks
Tutti	Visual Studio Code (non è un IDE completo, ma ci va vicino)

    public static void main(String[] args)
    {
        class Contenitore
        {
            double altezza,larghezza,profondita;
        }
        class ContenitoreDemo2
        {
            public static void main(String[] args)
            {
                Contenitore miocontenitore1 = new Contenitore();
                Contenitore miocontenitore2 = new Contenitore();
                double vol;
            }
            miocontenitore1.larghezza = 10;
            miocontenitore1.altezza = 20;
            miocontenitore1.profondita = 40;

            miocontenitore2.larghezza = 3;
            miocontenitore2.altezza = 6;
            miocontenitore2.profondita = 12;
        }
    } 
}*/
//Classi Java, ci può essere un solo Public. Il public prnede il nome del file.
    static class Contenitore {
        double altezza, larghezza, profondita;
    }

    public static void main(String[] args) 
    {
        Contenitore miocontenitore1 = new Contenitore();
        Contenitore miocontenitore2 = new Contenitore();
        double vol;

        miocontenitore1.larghezza = 10;
        miocontenitore1.altezza = 20;
        miocontenitore1.profondita = 40;

        miocontenitore2.larghezza = 3;
        miocontenitore2.altezza = 6;
        miocontenitore2.profondita = 12;

        vol = miocontenitore1.altezza * miocontenitore1.larghezza * miocontenitore1.profondita;
        System.out.println("Volume del primo contenitore: " + vol);
        vol = miocontenitore2.altezza * miocontenitore2.larghezza * miocontenitore2.profondita;
        System.out.println("Volume del secondo contenitore: " + vol);
    }
    public class Provaparametri
    {
    public static void mian(String[] args)
        {
        int var_ris;
        int var1 = 2;
        int var2 = 3;
        System.out.println("__________Prima delle clssi__________");
        System.out.println("Volume del var1: " + var1);
        System.out.println("Volume del var2: " + var2);
        var_ris = dimostro_parametri(var1 , var2);
        System.out.println("Volume del var1: " + var1);
        System.out.println("Volume del var2: " + var2);
        public static int dimostro_parametri(int k, int m)
        {
            int a,b;
            a = k*2;
            b = m /2;
            m = m*4;
            System.out.println("__________Dimostro Parametri__________");
            System.out.println("K vale: " +k);
            System.out.println("M vale: " + m);
            System.out.println("A vale: " + a);
            System.out.println("B vale: " + b);
            return m;
        }
        
    }
}  
