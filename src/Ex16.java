import java.time.LocalDate;
import java.util.Scanner;

public class Ex16 {

    static void main() {

        // 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
        //equilátero, isósceles ou escaleno.

        Scanner scanner= new Scanner(System.in);

        IO.print("Informe o valor do lado A: ");
        int a = scanner.nextInt();
        IO.print("Informe o valor do lado B: ");
        int b = scanner.nextInt();
        IO.print("Informe o valor do lado C: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a){
            if (a == c && b == c){
                IO.println("Triângulo equilátero");
            } else if (a == b || b == c || c == a) {
                IO.println("Triângulo isósceles");
            } else {
                IO.println("Triângulo escaleno");
            }
        } else {
            IO.println("As medidas não formam um triângulo válido.");
        }

        scanner.close();
    }
}
