import java.util.Scanner;
public class Alg07_1{
    public static void tabuada(int a){
        for (int x=1;x<11;x++){
            int n = a * x;
            System.out.println(a + " x "+ x + " = " + n );
            n = 0;
        }
    }
    public static void main(String[] args) throws Exception {
        var entrada = new Scanner(System.in);
        System.out.print("Digite um número para saber sua tabuada: ");
        int number = entrada.nextInt();
        tabuada(number);
        }
    }