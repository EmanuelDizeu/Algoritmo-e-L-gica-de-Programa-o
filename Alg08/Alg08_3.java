package Alg08;
/*Inversão de Vetor Escreva um programa em Java que leia um vetor de 6 números inteiros. 
O programa deve inverter a ordem dos elementos diretamente no próprio vetor (ou utilizando um vetor auxiliar) 
e exibir os valores resultantes após a inversão. */
import java.util.Scanner;
public class Alg08_3 {
    public static void inversor(){
        var entrada = new Scanner(System.in);
        int []numbers = new int[6];
        String[]positions = {"primeira", "segunda", "terceira", "quarta", "quinta", "sexta"};
        int []inversor = new int[6];
        for(int x=0; x < 6; x ++){
            System.out.println("Digite o número da "+positions[x]+" posição: ");
            numbers[x] = entrada.nextInt();
        }
        for(int x=0; x < 6; x ++){
            inversor[x] = numbers[5 - x];
        }
        System.out.println("A ordem invertida dos número é: ");
        for(int x=0; x < 6; x++){
            System.out.print(inversor[x] +" ");
        }
    }

    public static void main(String[]args){
        inversor();
    }
}
