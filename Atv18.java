/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Informa o fatorial do número desejado
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        long fatorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
