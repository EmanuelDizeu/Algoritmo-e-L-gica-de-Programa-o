import java.util.Scanner;
public class Alg07_3 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        float saldo, valor;
        int op;
        String continua;

        System.out.println("Informe o saldo inicial: ");
        saldo = entrada.nextFloat();
        do {
            System.out.println("1-Saldo, 2-Depósito, 3-Saque: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Saldo = "+saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito: ");
                    valor = entrada.nextFloat();
                    saldo = valor + saldo;
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor do saque: ");
                    valor = entrada.nextFloat();
                    if (valor<=saldo){
                        saldo = saldo - valor;
                        System.out.println("Saldo atual: "+ saldo);
                    } else {
                        System.out.println("Saldo insuficiente: "+ saldo);
                    }
                    break;
                default:
                 System.out.println("Operação inválida.");
                 break;
            }
            System.out.println("Você deseja continuar?(S/N)");
            continua = entrada.next();
        } while(continua.equals("S") || continua.equals("s"));
    }
}