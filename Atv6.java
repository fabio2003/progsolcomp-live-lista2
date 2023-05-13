/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Confere nota dos alunos
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = input.nextInt();

        String conceito;

        if (nota >= 0 && nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota <= 64) {
            conceito = "Regular";
        } else if (nota >= 65 && nota <= 84) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        } else {
            System.out.println("Nota inválida!");
            return;
        }

        System.out.println("Conceito do aluno: " + conceito);

        input.close();
    }
}

