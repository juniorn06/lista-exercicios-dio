import java.time.LocalDate;
import java.util.Scanner;

public class Ex15 {

    static void main() {

        // 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa já viveu. Leve em
        //consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 2 meses e 15 dias de vida)

        Scanner scanner= new Scanner(System.in);

        LocalDate dataAtual = LocalDate.now();

        IO.print("Informe seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        IO.println("Você viveu " + (dataAtual.getYear() - anoNascimento) + " anos, " +  dataAtual.getMonthValue() + " meses e " + dataAtual.getDayOfMonth() + " dias.");

        scanner.close();
    }
}
