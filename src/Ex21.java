import java.util.Random;

public class Ex21 {

    static void main() {

        // 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

        Random random = new Random();

        int numRandom = random.nextInt(100);

        IO.println("Número sorteado: " + numRandom);
    }
}
