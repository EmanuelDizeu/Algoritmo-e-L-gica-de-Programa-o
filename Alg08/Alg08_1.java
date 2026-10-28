package Alg08;
/*Maior, Menor e Média Crie um programa em Java que leia um vetor 
de 10 números inteiros fornecidos pelo usuário. Em seguida, o programa deve
 calcular e exibir:
O maior valor armazenado no vetor.
O menor valor armazenado no vetor.
A média aritmética dos elementos do vetor. */
import java.util.Scanner;
public class Alg08_1 {
    public static void mmm(){
        var entrada = new Scanner(System.in);
        int[]numbers = new int[10];
        String[]positions = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono", "décimo"};
        int menor = 0;
        int maior = 0;
        double media = 0;
        for(int x = 0; x < 10; x ++){
            System.out.print("Informe um número:");
            numbers[x] = entrada.nextInt();
            if (x == 0){
                maior = numbers[x];
                menor = numbers[x];
            } else if (numbers[x] > maior){
                maior = numbers[x];
            } else if(numbers[x] < menor){
                menor = numbers[x];
            }
            media = media + numbers[x];
        }
        media = media/10;
        for(int x = 0;x < 10; x ++){
            System.out.println("O "+ positions[x] +" número digitado foi "+ numbers[x]);
        }
        System.out.println("O maior número foi "+maior);
        System.out.println("O menor número foi "+menor);
        System.out.println("A média aritmética dos números digitados é "+media);
    }

    public static void main(String[]args){
        mmm();
    }
}
