import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Scanner
        Scanner valor = new Scanner(System.in);

        //Entrada de dado NPA
        System.out.println("Insira a nota da NPA: ");
        float npa = valor.nextFloat();

        if(npa >= 60){
            System.out.println("Aluno aprovado");
        } else{
            System.out.println("Fazer NP3");
            System.out.println("Insira a nota da NP3: ");

            //Entrada de dado NP3
            float np3 = valor.nextFloat();
            float nfa = npa + np3;
            if(nfa >= 50) {
                System.out.println("Aluno aprovado");
            }
                else{
                    System.out.println("Aluno reprovado");
                }
            }
        valor.close();
        }
    }

