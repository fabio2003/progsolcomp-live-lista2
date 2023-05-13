/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Pede números enquanto for maior ou igual a zero
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número (ou um número menor que 0 para sair): ");
            numero = input.nextInt();
        }

        System.out.println("Você digitou um número menor que 0. Programa encerrado.");
    }
}
