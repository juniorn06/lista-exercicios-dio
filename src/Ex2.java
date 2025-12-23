import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    static void main() {
        //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Informe um número: ");
            int num = scanner.nextInt();
            verificaNumero(num);
        } catch (InputMismatchException e){
            IO.println("Erro! O número informado não é do tipo inteiro!");
        }
    }

    static void verificaNumero(int num){
        String parImpar = (num % 2 == 0 && num > 0) ? "O número informado é par" : "O número informado é ímpar";
        IO.println(parImpar);

        if (num > 0){
            IO.println("O número informado é positivo");
        } else if (num < 0) {
            IO.println("O número informado é negativo");
        } else {
            IO.println("Número zero. O número não é positivo ou negativo.");
        }

    }
}
