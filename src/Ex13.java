import java.util.Scanner;

public class Ex13 {

    static void main() {

        // 13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela for maior ou menor de idade.

        Scanner input = new Scanner(System.in);

        IO.print("Informe o nome da pessoa: ");
        String nome = input.nextLine();
        IO.print("Informe a idade da pessoa: ");
        int idade = input.nextInt();

        if (idade >= 0 && idade < 18) {
            IO.println("Nome: " + nome + ". Você é menor de idade. ");
        } else {
            IO.println("Nome: " + nome + ". Você é maior de idade. ");
        }

        input.close();
    }
}
