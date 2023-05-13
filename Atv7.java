/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Calcula o preço da hospedagem
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = input.nextInt();

        double precoDiaria = 60.0;
        double taxaServico;

        if (numDiarias > 15) {
            taxaServico = 5.5;
        } else if (numDiarias == 15) {
            taxaServico = 6.0;
        } else {
            taxaServico = 8.0;
        }

        double precoTotal = numDiarias * precoDiaria + numDiarias * taxaServico;

        System.out.printf("O preço total da hospedagem é R$ %.2f\n", precoTotal);

        input.close();
    }
}

