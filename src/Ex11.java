import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {

    static void main() {

        //11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
        //se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double nota;
        double totalNotas = 0;

        for (int i = 1; i <= 4; i++) {
            IO.print("Informe o valor da " + i + "º nota: ");
            nota = scanner.nextDouble();
            totalNotas += nota;
        }

        double mediaAluno = totalNotas / 4;

        IO.println("Média: " + df.format(mediaAluno) + statusAluno(mediaAluno));
    }

    public static String statusAluno (double nota){
        if (nota < 7){
            return "O aluno está reprovado.";
        }
        return "O aluno está aprovado.";
    }
}
