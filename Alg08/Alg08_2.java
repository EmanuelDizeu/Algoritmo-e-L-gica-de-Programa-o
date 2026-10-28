package Alg08;
/*Busca e Frequência Desenvolva um programa em Java que leia um vetor de 8 posições com números inteiros. 
Depois, solicite ao usuário um número inteiro para ser buscado no vetor. O programa deve informar:
Se o número está ou não presente no vetor.
Quantas vezes ele aparece (frequência).
Em quais posições (índices) ele foi encontrado. */
import java.util.Scanner;
public class Alg08_2 {
public static boolean contem(int[]vetor, int elemento){
    for (int x : vetor) {
        if (x == elemento){
            return true;
        }
    }
    return false;
}

    public static void busca(){
        var entrada = new Scanner(System.in);
        int[]numbers = new int[8];
        String[]positions = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo"};
        String[]positions2 = {"primeira", "segunda", "terceira", "quarta", "quinta", "sexta", "sétima", "oitava"};
        int cont_number = 0;
        int y = 0;
        System.out.println("Digite os números para a lista.");
        for(int x=0;x<8;x++){
            System.out.print("Digite o "+ positions[x]+" número: ");
            numbers[x] = entrada.nextInt();
        }
        System.out.print("Digite o número que você deseja buscar dentro da lista: ");
        int search = entrada.nextInt();
        for(int x=0;x<8;x++){
            if(numbers[x] == search){
                System.out.println("O número "+numbers[x] + " está na "+positions2[x]+" posição");
                cont_number ++;
            } else if((!contem(numbers, search))){
                System.out.println("O número não está presente na lista. ");
                y = 1;
            }
        }
        if(y != 1){
            System.out.println("A frequência que o número digitado aparece é de "+cont_number+" vezes.");
        }
    }
    public static void main(String[]args){
        busca();
    }
}
