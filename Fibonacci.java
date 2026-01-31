import java.util.Scanner;
//si può prendere l'input da terminale senza lo java.util.scanner? da chiedere

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) 
        return 0;
        else if (n == 2) 
        return 1; 
        else 
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int n = scanner.nextInt();
        //se il numero non è intero o è negativo, richiedi di nuovo l'input
        while (n < 1) {
            System.out.print("Per favore, inserisci un numero intero positivo: ");
            n = scanner.nextInt();
        }
        System.out.println("Fibonacci di " + n + " e': " + fibonacci(n));
        scanner.close();
    }
}

// lista numeri fibonacci per confronto = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765