import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {

    static void main() {

        // 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
        // pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
        // Tabela de Código de Condições de Pagamento
        // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
        // 2 - À Vista no cartão de crédito, recebe 10% de desconto
        // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
        // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        IO.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        IO.print("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        IO.print("---- Forma de pagamento ---- \n");
        IO.println("""
                1 - À Vista em Dinheiro ou Pix\s
                2 - À Vista no cartão de crédito
                3 - Parcelado no cartão em duas vezes
                4 - Parcelado no cartão em três vezes ou mais""");
        int formaPagamento = scanner.nextInt();

        IO.println("Produto: " + nomeProduto);
        IO.println("Valor final do produto: " + calculoPagamento(formaPagamento, valorProduto));

        scanner.close();
    }
    
    public static double calculoPagamento(int formaPagamento, double valor){
        
        double valorFinal = 0;

        if (formaPagamento == 1){
            valorFinal = valor - (valor * 0.15);
        } else if (formaPagamento == 2) {
            valorFinal = valor - (valor * 0.10);
        } else if (formaPagamento == 3){
            valorFinal = valor;
            IO.println("Forma de pagamento sem desconto. Valor final do produto: " + valorFinal);
        } else {
            valorFinal = valor * 1.10;
        }
        return valorFinal;
    }
}
