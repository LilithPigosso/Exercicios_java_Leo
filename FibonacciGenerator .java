import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade digitos que quer: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci com " + n + " dígitos:");
        generateFibonacci(n);
    }

    private static void generateFibonacci(int n) {
        int primeiro = 0;
        int segundo = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");

            int next = first + second;
            primeiro = segundo;
            segundo = next;
        }
    }
}
