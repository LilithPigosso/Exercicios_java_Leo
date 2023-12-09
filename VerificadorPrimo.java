import java.util.Scanner;

public class VerificadorPrimo {
    static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo:");
        int numero = scanner.nextInt();

        if (isPrimo(numero)) {
            System.out.println(numero + " é um primo.");
        } else {
            System.out.println(numero + " não é um primo.");
        }

        scanner.close();
    }
}
