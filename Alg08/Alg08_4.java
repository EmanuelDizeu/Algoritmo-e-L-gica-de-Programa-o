package Alg08;
  import java.util.Scanner;
public class Alg08_4 {
    public static void par_ímpar(){
        var entrada = new Scanner(System.in);
        int []principal = new int[10];
        String []positions = {"primeira", "segunda", "terceira", "quarta", "quinta", "sexta", "sétima", "oitava", "nona", "décima"};
        int []par = new int[10];
        int cont_par = 0;
        int []ímpar = new int[10];
        int cont_ímpar = 0;

        for(int x=0; x < 10; x++){
            System.out.println("Digite a "+positions[x]+" posição.");
            principal[x] = entrada.nextInt();
            if(principal[x] % 2 == 0){
                par[cont_par] = principal[x];
                cont_par ++;
            } else {
                ímpar[cont_ímpar] = principal[x];
                cont_ímpar ++;
            }
        }
        System.out.print("Os números pares digitados são: ");
        for(int x=0; x < cont_par; x++){
            System.out.print(par[x] +" ");
        }
        System.out.println(" ");
        System.out.print("Os números ímpares digitados são: ");
        for(int x=0; x < cont_ímpar; x++){
            System.out.print(ímpar[x]+" ");
        }
    }

    public static void main(String[]args){
        par_ímpar();
    }
}
