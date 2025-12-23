import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {

    static void main() {
        //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Informe um número: ");
            int num = scanner.nextInt();

            IO.println("Número antecessor: " + (num -1) + ". Número sucessor: " + (num + 1) + ".");
        } catch (InputMismatchException e){
            IO.println("Erro! O número informado não é do tipo inteiro!");
        }

        scanner.close();
    }
}
