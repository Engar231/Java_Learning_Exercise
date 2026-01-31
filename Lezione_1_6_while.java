public class Lezione_1_6_while {
    public static void main(String[] args) {
        // boolean condizionewhile = false;
        // int var_num = 1;
        // int var_num1 = 2;

        boolean var_continua = true;
        int var_conta = 1;

        while (var_continua) { // Si attiva quando la variabile è true
            System.out.println("Valore var_conta " + var_conta);
            if (var_conta != 5) {
                var_conta++;
            } else {
                var_continua = false;
            }
        }
        System.out.println("Siamo fuori la While");

        boolean nemico = true;
        int colpi_hokuto = 1;
        System.out.println("Kenshiro si prepara a colpire con i suoi colpi velocissimi!!");

        while (nemico) {
            System.out.println("Ha inflitto " + colpi_hokuto + " colpi all'avversario!");
            if (colpi_hokuto != 10) {
                colpi_hokuto++;
            } else {
                System.out.println("Il nemico è stato distrutto");
                nemico = false;
            }
        }

        int a = 0;
        int b = 1;
        int fibo = a + b;

        System.out.print(a + " " + b + " ");
        while (fibo <= 34) {
            System.out.print(fibo + " ");
            a = b;
            b = fibo;
            fibo = a + b;
        }

        // Ciclo For 
        // for (int i = 0, j = 5; i <= 5 && j <= 5; i++, j--) {
        //     System.out.print("For semplice, Valore di i " + i + " Valore j " + j);
        // }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Valore di i " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("Valore di j " + j);
            }
        }

        int i = 5;
        for (; i <= 5;) {
            System.out.print("Valore di i semplice " + i);
            break;
        }

        for (int k = 2; k < 10; k += 2) { //Questa è una for i in range(2,10,2)
            System.out.print("\n" + k + " ");
        }
    }
}
