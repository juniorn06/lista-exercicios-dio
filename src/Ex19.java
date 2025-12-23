import java.util.Scanner;

public class Ex19 {

    static void main() {

        // 19 - Faça um algoritmo que imprima na tela na tabuada de 1 até 10.

        for (int i = 1; i <= 10; i++) {
            IO.println();
            for (int j = 1; j <= 10 ; j++) {
                IO.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
