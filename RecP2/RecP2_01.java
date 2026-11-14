package RecP2;
import java.util.Scanner;

public class RecP2_01 {

    public static boolean cpfJaCadastrado(int[][] matriz, int totalCadastrados, int cpf) {
        for (int i = 0; i < totalCadastrados; i++) {
            if (matriz[i][0] == cpf) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] dados = new int[10][3];
        String[] posições = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono", "décimo"};

        int x = 0;

        while (x < 10) {
            System.out.println("\n--- Cadastro do " + posições[x] + " inscrito ---");
            
            System.out.print("Digite o CPF do inscrito: ");
            int cpf = entrada.nextInt();

            if (cpfJaCadastrado(dados, x, cpf)) {
                System.out.println("CPF ja cadastrado registro não inserido");
                continue; 
            }

            dados[x][0] = cpf;

            System.out.print("Digite a idade do inscrito: ");
            dados[x][1] = entrada.nextInt();

            System.out.print("Digite o número do curso escolhido ([1-ADS] [2-GECOM] [3-Eventos] [4-RH]): ");
            dados[x][2] = entrada.nextInt();
            x++;
        }

        int qtdADS = 0, qtdGECOM = 0, qtdEventos = 0, qtdRH = 0;
        int somaIdades = 0;

        for (int i = 0; i < 10; i++) {
            somaIdades += dados[i][1]; // Soma a idade (coluna 1)

            switch (dados[i][2]) {
                case 1:
                    qtdADS++;
                    break;
                case 2:
                    qtdGECOM++;
                    break;
                case 3:
                    qtdEventos++;
                    break;
                case 4:
                    qtdRH++;
                    break;
            }
        }

        double mediaIdade = (double) somaIdades / 10;

        System.out.println("\n========================================");
        System.out.println("          RELATÓRIO DO VESTIBULAR         ");
        System.out.println("========================================");
        System.out.println("Quantidade de inscritos por curso:");
        System.out.println(" - ADS (1): " + qtdADS);
        System.out.println(" - GECOM (2): " + qtdGECOM);
        System.out.println(" - Eventos (3): " + qtdEventos);
        System.out.println(" - RH (4): " + qtdRH);
        System.out.println("----------------------------------------");
        System.out.println("Média de idade dos inscritos: " + mediaIdade + " anos");
        System.out.println("========================================");

        entrada.close();
    }
}