import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {

    static void main() {

        // 18 -Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
        // Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.

        Scanner scanner= new Scanner(System.in);

        double francisco = 1.50;
        double sara = 1.10;
        int anos = 0;

        while (francisco > sara){
            francisco += 0.02;
            sara += 0.03;
            anos++;
        }

        IO.println("Em " + anos + " anos, Sara será maior que Francisco.");

        scanner.close();
    }
}
