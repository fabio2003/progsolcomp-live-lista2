/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Números pares de 1 a 100 ordem inversa
* Data: 13/05/2023
*/

public class Atv11 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
