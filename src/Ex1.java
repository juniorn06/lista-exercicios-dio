import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

    static void main() {
        //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Informe o valor de A: ");
            int a = scanner.nextInt();
            IO.print("Informe o valor de B: ");
            int b = scanner.nextInt();
            IO.print("Informe o valor de C: ");
            int c = scanner.nextInt();

            int soma = a + b;
            IO.println("Valor da soma de A + B: " + soma);

            if (soma > c){
                IO.println("O valor da soma é maior que o valor de C.");
            } else if (soma == c) {
                IO.println("O valor da soma é igual ao valor de C.");
            } else {
                IO.println("O valor da soma é menor que o valor de C.");
            }
        } catch (InputMismatchException e){
            IO.println("Erro! O número informado não é do tipo inteiro!");
        }
    }
}
