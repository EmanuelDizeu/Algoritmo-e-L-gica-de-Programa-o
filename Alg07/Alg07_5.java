import java.util.Scanner;
public class Alg07_5{
    public static void fatorial(int a){
        int fatorial = 1;
        int cont = a;
        do {
            System.out.println("!" + cont);
            fatorial = fatorial * cont;
            cont --;
        } while(a > 1);
        System.out.println("!"+1);
        System.out.println("O resultado do fatorial é "+ fatorial);
    }

    
    public static void main(String[]args){
        int number = 0;
        var entrada = new Scanner(System.in);
        System.out.println("Digite um número para saber o seu fatorial: ");
        number = (entrada.nextInt());
        fatorial(number);
    }
    
}