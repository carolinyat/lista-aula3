import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Scanner
        Scanner alunos = new Scanner(System.in);
        System.out.print("Insira o número de alunos matriculados: ");
        int nAlunos = alunos.nextInt();

        switch (nAlunos){
            case 10:
            case 20:
                System.out.println("Sala |-15");
                break;
            case 30:
                System.out.println("Sala |-22");
                break;
            default:
                System.out.println("Número incompatível");
                break;
        }

        alunos.close();
    }
}
