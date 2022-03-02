import java.util.Random;
import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        //Gerando um número aleatório entre 1 a 10
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        int num;

        System.out.println("Insira um número inteiro de 1 a 10: ");
        do {
            num = valor.nextInt();
        }while(num != x);
        System.out.println("Valor correto!");

        valor.close();
    }
}
