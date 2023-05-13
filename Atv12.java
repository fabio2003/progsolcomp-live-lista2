/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Exibe números pares até encontrar um múltiplo de 7
* Data: 13/05/2023
*/

public class Atv12 {
    public static void main(String[] args) {
        int numero = 0;
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}
