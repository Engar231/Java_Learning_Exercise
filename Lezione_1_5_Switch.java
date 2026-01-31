public class Lezione_1_5_Switch {
    public static void main(String[] args) 
    {
    
        int sconto = 10;

	// Se si ha un IF con solo confronti di ugualglianza
        if (sconto == 10) {
            System.out.println("sei un nuovo cliente");
        } else if (sconto == 20) {
            System.out.println("è il tuo secondo acquisto");
        } else if (sconto == 30) {
            System.out.println("sei molto fedele");
        } else if (sconto == 40) {
            System.out.println("sei un campione di acquisti");
        } else {
            System.out.println("sconto non valido");
        }

	// Java preferisce che si scriva una switch 
	// sintassi della versione di JDK fino alla 13
        switch (sconto) {
            case 10:
                System.out.println("sei un nuovo cliente switch");
                break;
            case 20:
                System.out.println("è il tuo secondo acquisto switch");
                break;
            case 30:
                System.out.println("sei molto fedele switch");
                break;
            case 40:
                System.out.println("sei un campione di acquisti switch");
                break;
            default:
                System.out.println("sconto non valido switch");
                break;
        }

	// nuova switch a freccia (switch rule, da Java14)
        switch (sconto) {
            case 10 -> System.out.println("sei un nuovo cliente switch2");
            case 20 -> System.out.println("è il tuo secondo acquisto switch2");
            case 30 -> System.out.println("sei molto fedele switch2");
            case 40 -> System.out.println("sei un campione di acquisti switch2");
            default -> System.out.println("sconto non valido switch2");
        }

	// switch vecchia con condizioni in OR
        switch (sconto) {
            case 10:
            case 15:
            case 18:
                System.out.println("sei un nuovo cliente switch");
                break;
            case 20:            
                System.out.println("è il tuo secondo acquisto switch");
                break;
            case 30:
                System.out.println("sei molto fedele switch");
                break;
            case 40:
                System.out.println("sei un campione di acquisti switch");
                break;
            default:
                System.out.println("sconto non valido switch");
                break;
        }
        
        // switch rule con condizioni in OR
        switch (sconto) {
            case 10, 15, 18 -> System.out.println("sei un nuovo cliente switch2");
            case 20 -> {
                System.out.println("è il tuo secondo acquisto switch2");
                System.out.println("per più di una istruzione, ricorda le parentesi graffe");
            }
            case 30 -> System.out.println("sei molto fedele switch2");
            case 40 -> System.out.println("sei un campione di acquisti switch2");
            default -> System.out.println("sconto non valido switch2");
        }


	// switch di assegnazione valore
        int var_scelta = 1;
        
        System.out.println("Inizio");
        
        String var_messaggio; 
        
        // Switch rule con assegnazione di valore alla variabile
        switch (var_scelta) {
              case 1 -> var_messaggio = "Sono nel case 1";
              case 2 -> var_messaggio = "Sono nel case 2";
              case 3 -> var_messaggio = "Sono nel case 3";
            default  -> var_messaggio = "Sono nel default";
        }
        
        System.out.println("var_messaggio vale:" + var_messaggio);

	// Switch rule con restituzione di valore alla variabile (sintassi più idonea), attenzione: la default è obbligatoria con l'assegnazione
        var_messaggio = switch (var_scelta) {
             case 1 -> "Sono nel case 1";
             case 2 -> "Sono nel case 2";
             case 3 -> "Sono nel case 3";
            default -> "Sono nel default";
        };

	// Switch rule con restituzione di valore alla variabile con più istruzioni (yield)
        var_messaggio = switch (var_scelta) {
              case 1 -> {
                  int somma = 4 + 5;
                  yield  "Sono nel case 1"; 
              }
              case 2 -> "Sono nel case 2";
              case 3 -> "Sono nel case 3";
            default  -> "Sono nel default";
        };

	// Switch con due punti con restituzione di valore alla variabile (sempre e solo da Java14)
        var_messaggio = switch (var_scelta) {
              case 1: 
                  int somma = 4 + 5;
                  yield "Sono nel case 1";
              case 2, 55: yield "Sono nel case 2";
              case 3: yield "Sono nel case 3";
              default: yield "Sono nel default";
        };
        System.out.println("var_messaggio vale:" + var_messaggio);
    }
}
