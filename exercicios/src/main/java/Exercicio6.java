import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        //Número aleatório
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        int num;

        System.out.println("Insira um número inteiro de 1 a 10: ");
        do {
            num = valor.nextInt();
            if(num>x) {
                System.out.println("Número digitado maior que o gerado pelo computador!");
            }
            else {
                System.out.println("Número digitado menor que o gerado pelo computador!");
            }
            }while(num != x);

        System.out.println("Valor correto!");

        valor.close();
    }
}

