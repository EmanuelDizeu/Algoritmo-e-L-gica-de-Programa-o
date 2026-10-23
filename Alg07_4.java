import java.util.Scanner;
public class Alg07_4 {
    public static void potencia(int base, int expoente) {
        int cont = 0;
        int resultado = 1;
        do{    
            resultado = resultado * base;
            cont ++;
        } while(cont < expoente);
        System.out.println("O resultado desta conta é: "+ resultado);
    }
    public static void main(String[]args){
        var entrada = new Scanner(System.in);
        System.out.print("Digite dois números, base e expoente respectivamente ");
        System.out.println("e saiba o resultado entre eles. ");
        System.out.print("Digite a base: ");
        int base = entrada.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = entrada.nextInt();
        potencia(base,expoente);
    }
}