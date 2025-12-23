import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {

    static void main() {
        //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        //  caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Informe o valor de A: ");
            int a = scanner.nextInt();
            IO.print("Informe o valor de B: ");
            int b = scanner.nextInt();
            int c = 0;

            String resultado = (a == b) ? "Valores de A é igual a B. A soma dos valores é " + (a + b) : "Valores de A é diferente de B. " +
                    "A multiplicação dos valores é " + (a * b);
            IO.println(resultado);
        } catch (InputMismatchException e){
            IO.println("Erro! O número informado não é do tipo inteiro!");
        }

        scanner.close();
    }
}
