import java.util.Scanner;

public class Ex14 {

    static void main() {

        // 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        Scanner scanner= new Scanner(System.in);

        IO.print("Informe o valor de A: ");
        int a = scanner.nextInt();
        IO.print("Informe o valor de B: ");
        int b = scanner.nextInt();
        int c = 0;

        c = a;
        a = b;
        b = c;

        IO.print(a + " - " + b);

        scanner.close();
    }
}
