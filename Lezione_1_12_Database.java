import java.sql.*; //importiamo la libreria per gestire il database

public class Lezione_1_12_Database //nome classe, deve essere uguale al nome del file al solito
{
    public static void main(String[] args) throws Exception //sempre il main
    // throws Exception per gestire gli errori
    {
    try 
        {
            //connessione DB. Database è una classe interna di Java. In questo momento stiamo facendo
            //come su Python, con MYSQL, versione light.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            //Query, qui gli stiamo dicendo cosa fare. selezionare nome, cognome dalla tabella client e leggendo l'id codice clienti
            PreparedStatement statement = con.prepareStatement("SELECT NOME, COGNOME from T001_CLIENTI where ID_COD_CLIENTI = 1");
            //altre istruzioni sotto
            ResultSet result = statement.executeQuery();
            while (result.next()) 
            {
            System.out.println(result.getString(2));
            //qui prendiamo come valore cognome, non nome, perché nella tabella è il secondo campo
            //la colonna 0 non esiste, si parte da 1 SEMPRE.
            }
            con.commit(); //commit è per salvare modifiche
            statement.close();
            con.close(); //si vdeve chiusdere sempre la connessione al database
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
