import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7 {

    static void main() {
        // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Informe o valor booleano de A: ");
            boolean a = scanner.nextBoolean();
            IO.print("Informe o valor booleano de B: ");
            boolean b = scanner.nextBoolean();

            if (a && b) {
                IO.println("Ambos valores informados são verdadeiros");
            } else {
                IO.println("Os valores informados são falsos.");
            }
        } catch (InputMismatchException e) {
            IO.println("Erro! O valor informado não é do tipo boolean!");
        }

        scanner.close();
    }
}
