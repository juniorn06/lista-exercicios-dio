import java.util.Random;
import java.util.Scanner;

public class Ex22 {

    static void main() {

        // 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

        Scanner scanner = new Scanner(System.in);

        IO.print("Informe o valor de A: ");
        int a = scanner.nextInt();
        IO.print("Informe o valor de B: ");
        int b = scanner.nextInt();

        int quociente = a / b;
        int resto = a % b;

        IO.println("Quociente: " + quociente);
        IO.println("Resto da divisão: " + resto);

        scanner.close();
    }
}
