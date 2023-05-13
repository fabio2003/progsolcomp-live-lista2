/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Preenche com zeros todas as posições de uma matriz
* Data: 13/05/2023
*/

public class Atv15 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = 0;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
