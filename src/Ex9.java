import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex9 {

    static void main() {
        // 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
        //de acordo com a tabela abaixo:
        //Fórmula do IMC = peso / (altura) ²
        //Tabela Condições IMC
        //
        // Abaixo de 18,5   | Abaixo do peso
        // Entre 18,6 e 24,9 | Peso ideal (parabéns)
        // Entre 25,0 e 29,9 | Levemente acima do peso
        // Entre 30,0 e 34,9 | Obesidade grau I
        // Entre 35,0 e 39,9 | Obesidade grau II (severa)
        // Maior ou igual a 40 | Obesidade grau III (mórbida)

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.0");

        IO.print("Informe sua altura: ");
        double altura = scanner.nextDouble();
        IO.print("Informe sua peso: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        IO.println("IMC: " +  df.format(imc) + obterClassificacao(imc));

        scanner.close();
    }

    public static String obterClassificacao(double imc){
        if (imc < 18.5){
            return " Abaixo do peso";
        } else if (imc < 25) {
            return " Peso ideal! Parabéns!";
        } else if (imc < 30) {
            return " Levemente acima do peso";
        } else if (imc < 35) {
            return " Obesidade grau I";
        } else if (imc < 40) {
            return " Obesidade grau II";
        }
        return " Obesidade grau III";
    }
}
