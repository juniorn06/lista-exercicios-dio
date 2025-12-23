import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8 {

    static void main() {
        // 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Informe o valor de A: ");
            int a = scanner.nextInt();
            IO.print("Informe o valor de B: ");
            int b = scanner.nextInt();
            IO.print("Informe o valor de C: ");
            int c = scanner.nextInt();

            IO.println("Ordem decrescente:");
            if (a > b &&  a > c){
                if (b > c ){
                    IO.println(c + " " + b + " " + a);
                } else {
                    IO.println(b + " " + c + " " + a);
                }
            } else if (b > a && b > c) {
                if (a > c ){
                    IO.println(c + " " + a + " " + b);
                } else  {
                    IO.println(a + " " + c + " " + b);
                }
            } else {
                if (a > b){
                    IO.println(b + " " + a + " " + c);
                } else {
                    IO.println(a + " " + b + " " + c);
                }
            }
        } catch (InputMismatchException e) {
            IO.println("Erro! O valor informado não é do tipo inteiro!");
        }
        scanner.close();
    }
}
