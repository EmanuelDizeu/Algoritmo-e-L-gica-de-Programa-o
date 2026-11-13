package Alg09;
import java.util.Scanner;

public class Alg09_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[10][3];

        System.out.println("=== Cadastro de Temperaturas (10 Dias) ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nDia " + (i + 1) + ":");
            System.out.print("Digite a temperatura mínima: ");
            matriz[i][0] = scanner.nextDouble();
            
            System.out.print("Digite a temperatura máxima: ");
            matriz[i][1] = scanner.nextDouble();
            
            // Calcula a média e armazena na terceira coluna (índice 2)
            matriz[i][2] = (matriz[i][0] + matriz[i][1]) / 2.0;
        }

        int opcao;
        do {
            System.out.println("\n================ MENU ================");
            System.out.println("1. Temperatura mínima de todos os dias");
            System.out.println("2. Temperatura máxima de todos os dias");
            System.out.println("3. Maior variação de temperatura de todos os dias");
            System.out.println("4. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Temperatura Mínima de Cada Dia ---");
                    double menorGeral = matriz[0][0];
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Dia " + (i + 1) + ": " + matriz[i][0] + "°C");
                        if (matriz[i][0] < menorGeral) {
                            menorGeral = matriz[i][0];
                        }
                    }
                    System.out.println("Menor temperatura registrada no período: " + menorGeral + "°C");
                    break;

                case 2:
                    System.out.println("\n--- Temperatura Máxima de Cada Dia ---");
                    double maiorGeral = matriz[0][1];
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Dia " + (i + 1) + ": " + matriz[i][1] + "°C");
                        if (matriz[i][1] > maiorGeral) {
                            maiorGeral = matriz[i][1];
                        }
                    }
                    System.out.println("Maior temperatura registrada no período: " + maiorGeral + "°C");
                    break;

                case 3:
                    System.out.println("\n--- Maior Variação de Temperatura ---");
                    int diaMaiorVariacao = 0;
                    double maiorVariacao = matriz[0][1] - matriz[0][0];

                    for (int i = 0; i < 10; i++) {
                        double variacao = matriz[i][1] - matriz[i][0];
                        System.out.println("Dia " + (i + 1) + " variação: " + String.format("%.2f", variacao) + "°C");
                        if (variacao > maiorVariacao) {
                            maiorVariacao = variacao;
                            diaMaiorVariacao = i;
                        }
                    }
                    System.out.println("\nA maior variação ocorreu no Dia " + (diaMaiorVariacao + 1) + 
                                       " com " + String.format("%.2f", maiorVariacao) + "°C (Mín: " + 
                                       matriz[diaMaiorVariacao][0] + "°C, Máx: " + matriz[diaMaiorVariacao][1] + "°C)");
                    break;

                case 4:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}