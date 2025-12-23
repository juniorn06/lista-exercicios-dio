import java.util.Scanner;

public class Ex20 {

    static void main() {

        // 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

        Scanner scanner = new Scanner(System.in);

        IO.print("Informe o valor da tabuada: ");
        int tabuada = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            IO.println(tabuada + " x " + i + " = " + tabuada * i);
        }
    }
}
