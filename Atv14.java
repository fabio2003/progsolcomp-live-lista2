/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Preenche com zeros todas as posições de um vetor
* Data: 13/05/2023
*/

public class Atv14 {
    public static void main(String[] args) {
        int[] vet = new int[50];

        for(int i = 0; i < 50; i++){
            vet[i] = 0;
        }

        for(int i = 0; i < 50; i++){
            System.out.print(vet[i] + " ");
        }
    }
}
