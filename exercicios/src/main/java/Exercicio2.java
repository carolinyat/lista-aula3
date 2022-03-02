import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
       //Declarando o Scanner
        Scanner nZumbis = new Scanner(System.in);

        //Lendo os numeros de zumbis derrotados
        System.out.println("Insira a quantidade de zumbis derrotados nas últimas 3 partidas: ");
        int partida1 = nZumbis.nextInt();
        int partida2 = nZumbis.nextInt();
        int partida3 = nZumbis.nextInt();
        int soma = partida1 + partida2 + partida3;

        //Saída de dados soma e média
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma/3);


    }
}
