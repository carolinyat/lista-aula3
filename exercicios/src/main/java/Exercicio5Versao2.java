import java.util.Random;
import java.util.Scanner;

public class Exercicio5Versao2 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        //Gerando um número aleatório entre 1 a 10
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        int num;

        System.out.println("Insira um valor inteiro de 1 a 10: ");
        num = valor.nextInt();
        while(num != x){
            System.out.println("Valor incorreto, tente outra vez");
            num = valor.nextInt();
        }
        System.out.println("Valor correto!");
        valor.close();
    }
}


