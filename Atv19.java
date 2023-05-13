/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Determina o tempo necessário para atingir certo volume
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        int volumeInicial = scanner.nextInt();

        int volumeAtual = volumeInicial;
        int tempo = 0;

        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            tempo++;
        }

        System.out.println("O volume atingirá mais de 1000 cm³ após " + tempo + " segundos.");
        
    }
}
