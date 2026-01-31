import java.io.*; //tutti i package di Java èer scrittura e non.
import java.util.*; //per utility, come scanner e company
//Lo devo rifare a casa, troppo casini
public class Lezione_1_10_scritturafile 
{
    public static void main(String[] args) 
    {
        // 1) Scrivi ID e password su file (una volta sola)
        try
        {
            FileWriter scrittura = new FileWriter
        } 
        filescrittura.write("Username", "Password\n");
        Scanner mioScanner = new Scanner(System.in);
        boolean sentinella = true;
        while (!(inputUser("q")) && sentinella)
        {
            System.out.println("Inserisci Username o premi q per uscire: ");
            inputUser = mioScanner.nextline();
            if (inputUser.equals("q"))
            {
            sentinella = false;
            System.out.println("Sono nell'if fuori");
            break
            }
            file_scrittura.append(inputUser + ";");
            System.out.println("Inserisci Password: ");
            inputPass = mioScanner.nextLine();
            file_scrittura.append(inputPass);
            file_scrittura.append("\n");
        }
    System.out.println("_____FineScritturaFile______")
    file_scrittura.close();
    }
}
