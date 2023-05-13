/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Imprime o maior número
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        
        if (a > b) {
           System.out.println("O maior número é: " + a);
        } else if(b > a){
            System.out.println("O maior número é: " + b);
        }else {
            System.out.println("Os números são iguais");
        }
        
    }
}
