package AulasDIO;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner minhaLeitura = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7");
        int numero = minhaLeitura.nextInt();
        switch (numero) {
            case 1:
                //case 7:
                //System.out.println("Fim de semana."); opção de agrupamento, retirar o 7 ali embaixo
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: //qualquer opção que não esteja designada no switch case
                System.out.println("Opção inválida.");
        }
    }
}
