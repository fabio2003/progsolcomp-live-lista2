/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Soma números de 1 a 100 e imprime o valor total
* Data: 13/05/2023
*/

public class Atv13 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        
        while (numero <= 100) {
            soma += numero;
            numero++;
        }
        
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    
    }
}
