package RecP2;
import java.util.Scanner;

public class RecP2_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[][] tabela = new int[10][4]; 
        String[] times = new String[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Dados do " + (i + 1) + "º time ---");
            
            System.out.print("Nome do time: ");
            times[i] = entrada.nextLine();

            System.out.print("Total de vitórias: ");
            tabela[i][0] = entrada.nextInt();

            System.out.print("Total de empates: ");
            tabela[i][1] = entrada.nextInt();

            System.out.print("Total de derrotas: ");
            tabela[i][2] = entrada.nextInt();
            
            entrada.nextLine(); 

            tabela[i][3] = (tabela[i][0] * 3) + (tabela[i][1] * 1) + (tabela[i][2] * 0);
        }

      
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (tabela[j][3] < tabela[j + 1][3]) {
                    
                    int[] tempLinha = tabela[j];
                    tabela[j] = tabela[j + 1];
                    tabela[j + 1] = tempLinha;
                    String tempNome = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = tempNome;
                }
            }
        }
        System.out.println("\n========================================");
        System.out.println("       PÓDIO DO CAMPEONATO (TOP 3)      ");
        System.out.println("========================================");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "º Lugar: " + times[i] + 
                               " | Pontos: " + tabela[i][3] + 
                               " (V: " + tabela[i][0] + 
                               ", E: " + tabela[i][1] + 
                               ", D: " + tabela[i][2] + ")");
        }
        System.out.println("========================================");

        entrada.close();
    }
}