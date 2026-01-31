import java.util.Arrays;

public class Lezione_1_7_For 
{
    public static void main(String[] args) 
    {//Stampare solo i numeri pari dell'array e trova l'indice
    int arr1 [] = {1, 45, 99, 102, 102, 3, 5, 7, 8, 9, 11, 13}; //Array sempre in {}
        for (
            int i = 0; //Inizializzare la i intero a 0
            i < arr1.length; //lenght legge la lunghezza, quindi ti trova l'indice e la inserire nella i. 
            i++ //i va avanti.
            ) 
        {
        if (arr1[i] % 2 == 0) //Come Python, arr1[Indice] se diviso %2 e risulta uguale == 0 allora è pari. In quel caso 
        {//Parte IF.
        System.out.println("Numero pari: " + arr1[i] + " Indice: " + i);
        }
        }
        System.out.println("Fine Indice Array Numeri Pari");
        for (int i = 1; i <= 10; i++) //Righe Istogramma
        { 
            for (int j = 1; j <= i; j++) //Colonne Istogramma
            { 
                System.out.print("*"); // *per istrogramma
            }
            System.out.println(); //Per andare a capo
        }
        System.out.println("Fine Istogramma Normale");
        for (int i = 10; i >= 1; i--) //Righe decrescente istogramma
        {
            for (int j = 1; j <= i; j++) //Colonne istogramma 
            {
                System.out.print("*"); // * istogramma
            }
            System.out.println(); //Al solito, per andare a capo
        }
        System.out.println("Fine Istogramma Inverso");
        int size = 10;
        for (int i =0;i < size; i++)
        {
            int stelle = i*2 +1;
            int spazio = size - i -1;
            System.out.println(" ".repeat(spazio) + "*".repeat(stelle));
        }
        System.out.println(" ".repeat(size-1) + "|");
        System.out.println("Fine Istogramma Albero di Natale");
        int arr2[] = {1, 3, 5, 7, 8, 9, 11, 13};
        //Indicizziamo max e max 2, con l'arr2 settato a 0, vuoto.
        int max = arr2[0];
        int max2 = arr2[0];
        //Same con patate per pmax e smax, messi a 0
        int pmax, smax;
            pmax = 0;
            smax = 0;
//Per i che sarà uguale a 1, dove i dovrà fermarsi alla lungezza di array2, a passo incremenetale (1,2,3,4 etc)
        for (int i = 1; i < arr2.length; i++) 
        {//SE! Arr2 , filla completamente max con un numero impossibile da replicare /superare
            if (arr2[i] > max) 
            {//Inserisce il massimo dentro max2, e max poi diventa uguale al massimo numero preso dall'arr2[i]
                max2 = max;
                smax = pmax;
                max = arr2[i];
            //pmax diventa l'indice al raggiungimento
                pmax= i;
            } 
        //Altro If, l'indice massimo raggiunto dell'array2 se è superiore a max2 ma non superiore a max
            else if (arr2[i] > max2 && arr2[i] != max) 
            {//Inserisce quel numero dentro max2
                max2 = arr2[i];
                smax = i;
            }
        }
        System.out.println("Numero maggiore: " + max + " Indice " + pmax);
        System.out.println("Secondo numero maggiore: " + max2 + " Indice " +smax);
        System.out.println("Fine Indice Array Numero più grande");
//istogramma specie con 1,22,333,4444 e uno con 1,12,123,1234, fino al 10
         for (int i = 1; i <= 10; i++) //Righe Istogramma
        { 
            for (int j = 1; j <= i; j++) //Colonne Istogramma
            { 
                System.out.print(i); // i per far vedere cosa l'iondice per istrogramma
            }
            System.out.println(); //Per andare a capo
        }
        System.out.println("Fine Istogramma 1,22,333 istogramma per colonna (i)");
        for (int i = 1; i <= 10; i++) //Righe Istogramma
        { 
            for (int j = 1; j <= i; j++) //Colonne Istogramma
            { 
                System.out.print(j); // j per far vedere cosa l'iondice J  per istrogramma
            }
            System.out.println(); //Per andare a capo
        }
        System.out.println("Fine 1,22,333,4444 istogramma  per colonna (j)");
        //Bubble sort
        for 
            (
            int i = 0; //Inizializzare la i intero a 0
            i < arr1.length - 1; //lenght legge la lunghezza, quindi ti trova l'indice e la inserire nella i. 
            i++ //i va avanti.
            ) 
        {
            for 
                (
            int j = 0; //Inizializzare la i intero a 0
            j < arr1.length -1 - i; //lenght legge la lunghezza, quindi ti trova l'indice e la inserire nella i. 
            j++ //i va avanti.
                )
                {
            if (arr1[j] > arr1[j + 1]) 
                    {
            int bubble = arr1[j];
            arr1[j] = arr1[j + 1];
            arr1[j + 1] = bubble;
                    }
                }
        }
        System.out.println("Array ordinato: " + Arrays.toString(arr1));
        System.out.println("Fine Bubblesort");
    int giorni_mesi [] = new int [12]; //Array, dopo l'array sempre NEW e poi int,float,byte o quello che serve[numero];
    for (indice_array = 0; indice_array <==11; indice_array++)
        {
        if (i == 1)
        {
        giorni_mese(indice_array) = 28;
        } 
        else 
        {
        giorni_mese(indice_array) = 30;
        }
        else
        {
        giorni_mese(indice_array) = 31;
        }
        }
    }

}