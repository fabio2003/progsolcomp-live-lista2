/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Calcula o valor da venda
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da venda: ");
        double valorVenda = input.nextDouble();
        
        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Opção escolhida: ");
        int opcao = input.nextInt();
        
        double valorFinal = 0;
        
        switch(opcao) {
            case 1:
                valorFinal = valorVenda * 0.9;
                break;
            case 2:
                valorFinal = valorVenda * 0.95;
                break;
            case 3:
                valorFinal = valorVenda;
                break;
            case 4:
                valorFinal = valorVenda * 1.05;
                break;
            case 5:
                valorFinal = valorVenda * 0.92;
                break;
            case 6:
                valorFinal = valorVenda * 0.93;
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        
        System.out.printf("Valor da venda: R$ %.2f\n", valorVenda);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);
    }
}

