import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {

    static void main() {
        // 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        IO.print("Informe o valor do salário: ");
        double salario = scanner.nextDouble();

        double valorReajustado = (salario * 1.05);

        IO.println("Valor do salário reajustado em 5%: " + df.format(valorReajustado));

        scanner.close();
    }
}
