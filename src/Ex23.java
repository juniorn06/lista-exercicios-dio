import java.util.Scanner;

public class Ex23 {

    static void main() {

        // 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
        // valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

        Scanner scanner = new Scanner(System.in);

        IO.print("Informe o valor da hora de aula: ");
        double horaAula = scanner.nextDouble();
        IO.print("Informe o número de aulas lecionadas: ");
        int numeroAulas = scanner.nextInt();
        IO.print("Informe o percentual de desconto do INSS: ");
        double descInss = scanner.nextDouble();

        double salarioBruto = horaAula * numeroAulas;
        double desconto = salarioBruto * (descInss / 100);
        double salarioLiquido = salarioBruto - desconto;

        IO.println("Salário líquido: " + salarioLiquido);

        scanner.close();
    }
}
