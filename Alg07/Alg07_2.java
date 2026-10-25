import java.util.Scanner;
public class Alg07_2{
    public static void adivinhe(int a){
        var teclado = new Scanner(System.in);
        int b = 0;
        do {
            if (( a < 32)){
                System.out.println("O número é maior");
                System.out.println("Digite outro número: ");
                a = teclado.nextInt();
            } else if((a > 32)){
                System.out.println("O número é menor");
                System.out.println("Digite outro número: ");
                a = teclado.nextInt();
            } else if((a == 32)){
                System.out.println(" Parabéns o número você acertou é igual ao que eu pensei.");
                 b = 1;
            }
        } while((b != 1));
    }

    public static void main(String[]args){
        var entrada = new Scanner(System.in);
        System.out.println("Vou pensar em um número tente adivinhar.");
        System.out.print("Digite um número: ");
        int number = entrada.nextInt();
        adivinhe(number);
    }
}
