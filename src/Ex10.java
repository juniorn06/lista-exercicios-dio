import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {

    static void main() {
        //  Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        IO.print("Informe o valor da 1º nota: ");
        double nota1 = scanner.nextDouble();
        IO.print("Informe o valor da 2º nota: ");
        double nota2 = scanner.nextDouble();
        IO.print("Informe o valor da 3º nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        IO.println("Média das notas: " + df.format(media));

    }
}
