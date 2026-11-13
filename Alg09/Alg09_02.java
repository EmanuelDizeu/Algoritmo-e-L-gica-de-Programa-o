package Alg09;
import java.util.Scanner;

public class Alg09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[10][3];

        System.out.println("=== Cadastro de Triângulos (10 Triângulos) ===");
        System.out.println("Informe os 3 lados para cada triângulo.");

        for (int i = 0; i < 10; i++) {
            boolean valido = false;
            while (!valido) {
                System.out.println("\nTriângulo " + (i + 1) + ":");
                System.out.print("Lado A: ");
                double a = scanner.nextDouble();
                System.out.print("Lado B: ");
                double b = scanner.nextDouble();
                System.out.print("Lado C: ");
                double c = scanner.nextDouble();

                if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
                    matriz[i][0] = a;
                    matriz[i][1] = b;
                    matriz[i][2] = c;
                    valido = true;
                } else {
                    System.out.println("Valores inválidos! Os lados não formam um triângulo válido. Tente novamente.");
                }
            }
        }

        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;

        for (int i = 0; i < 10; i++) {
            double a = matriz[i][0];
            double b = matriz[i][1];
            double c = matriz[i][2];

            if (a == b && b == c) {
                equilateros++;
            } else if (a == b || b == c || a == c) {
                isosceles++;
            } else {
                escalenos++;
            }
        }

        double percEquilateros = (equilateros / 10.0) * 100.0;
        double percIsosceles = (isosceles / 10.0) * 100.0;
        double percEscalenos = (escalenos / 10.0) * 100.0;

        System.out.println("\n================ RELATÓRIO DE TRIÂNGULOS ================");
        System.out.println("Total de triângulos analisados: 10");
        System.out.printf("Equiláteros: %d (%.1f%%)\n", equilateros, percEquilateros);
        System.out.printf("Isósceles:   %d (%.1f%%)\n", isosceles, percIsosceles);
        System.out.printf("Escalenos:   %d (%.1f%%)\n", escalenos, percEscalenos);
        System.out.println("=========================================================");

        scanner.close();
    }
}
