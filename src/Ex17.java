import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex17 {

    static void main() {

        // 117 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
        // Fórmula: C = (5 * (F-32) / 9)

        Scanner scanner= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        IO.print("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;
        IO.println("Temperatura em Celsius: " + df.format(celsius));

        scanner.close();
    }
}
