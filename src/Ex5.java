import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {

    static void main() {
        //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1293.20;
        DecimalFormat df = new DecimalFormat("0.00");

        IO.print("Informe o valor do salário: ");
        double salario = scanner.nextDouble();

        double qtdSalarios = salario / salarioMinimo;

        IO.print("O funcionário recebe " + df.format(qtdSalarios) + " salários mínimos.");

        scanner.close();
    }
}
