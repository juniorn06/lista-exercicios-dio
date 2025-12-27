import java.util.Scanner;

public class Ex24 {

    static void main() {
        // 24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
        // Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados
        // para fazer a viagem. Fórmula: distância = tempo x velocidade. Litros usados = distância / 12.

        Scanner scanner = new Scanner(System.in);

        IO.print("Informe o tempo de viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();
        IO.print("Informe a velocidade média do veículo (em Km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double distanciaTotal = tempoViagem * velocidadeMedia;
        double litrosUtilizados = distanciaTotal / 12;

        IO.println();

        IO.println("Distância percorrida: " +distanciaTotal + " KM");
        IO.println("Quantidade de litros utilizados " + litrosUtilizados);

        scanner.close();
    }
}
