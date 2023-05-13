/* Nome do Aluno: Fábio Augusto V.
* RA: 323135349
* Nome do Programa: Mostra o mês e a estação
* Data: 13/05/2023
*/

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int numMes = input.nextInt();

        String nomeMes;
        String estacao;

        switch (numMes) {
            case 1:
                nomeMes = "Janeiro";
                estacao = "Verão";
                break;
            case 2:
                nomeMes = "Fevereiro";
                estacao = "Verão";
                break;
            case 3:
                nomeMes = "Março";
                estacao = "Outono";
                break;
            case 4:
                nomeMes = "Abril";
                estacao = "Outono";
                break;
            case 5:
                nomeMes = "Maio";
                estacao = "Outono";
                break;
            case 6:
                nomeMes = "Junho";
                estacao = "Inverno";
                break;
            case 7:
                nomeMes = "Julho";
                estacao = "Inverno";
                break;
            case 8:
                nomeMes = "Agosto";
                estacao = "Inverno";
                break;
            case 9:
                nomeMes = "Setembro";
                estacao = "Primavera";
                break;
            case 10:
                nomeMes = "Outubro";
                estacao = "Primavera";
                break;
            case 11:
                nomeMes = "Novembro";
                estacao = "Primavera";
                break;
            case 12:
                nomeMes = "Dezembro";
                estacao = "Verão";
                break;
            default:
                System.out.println("Mês inválido!");
                return;
        }

        System.out.println("O mês " + numMes + " é " + nomeMes + " e a estação é " + estacao);

        input.close();
    }
}

