import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione a forma geométrica:");
            System.out.println("1. Retângulo");
            System.out.println("2. Quadrado");
            System.out.println("3. Triangulo");
            System.out.println("4. Circulo");
            System.out.println("5. Trapezio");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a base do retângulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = sc.nextDouble();

                    Retangulo retangulo = new Retangulo(base, altura);
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = sc.nextDouble();

                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("Área do quadrado: " + quadrado.calcularArea());
                    System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
                    break;
                case 3:
                    System.out.print("Digite a base do triângulo: ");
                    double baseTriangulo = sc.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTriangulo = sc.nextDouble();
                    System.out.print("Digite o lado A do triângulo: ");
                    double ladoATriangulo = sc.nextDouble();
                    System.out.print("Digite o lado B do triângulo: ");
                    double ladoBTriangulo = sc.nextDouble();
                    System.out.print("Digite o lado C do triângulo: ");
                    double ladoCTriangulo = sc.nextDouble();

                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, ladoATriangulo, ladoBTriangulo, ladoCTriangulo);
                    System.out.println("Área do triângulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
                    break;

                case 4:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = sc.nextDouble();

                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                    break;

                case 5:
                    System.out.print("Digite a base maior do trapézio: ");
                    double baseMaior = sc.nextDouble();
                    System.out.print("Digite a base menor do trapézio: ");
                    double baseMenor = sc.nextDouble();
                    System.out.print("Digite a altura do trapézio: ");
                    double alturaTrapezio = sc.nextDouble();
                    System.out.print("Digite o lado A do trapézio: ");
                    double ladoATrapezio = sc.nextDouble();
                    System.out.print("Digite o lado B do trapézio: ");
                    double ladoBTrapezio = sc.nextDouble();

                    Trapezio trapezio = new Trapezio(baseMaior, baseMenor, alturaTrapezio, ladoATrapezio, ladoBTrapezio);
                    System.out.println("Área do trapézio: " + trapezio.calcularArea());
                    System.out.println("Perímetro do trapézio: " + trapezio.calcularPerimetro());
                    break;

                case 0:
                System.out.println("tchauzinho...");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    } while (opcao != 0);

    sc.close();
}
}
