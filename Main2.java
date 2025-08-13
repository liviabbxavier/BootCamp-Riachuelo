package AulasDIO;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 4;
        while (true) {
            System.out.println("Qual é o resultado da soma 2 + 2?");
            int resultado = leitura.nextInt();
            resultado++;

            if (resultado == 4) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Você errou! Tente novamente.");
            }
            leitura.close();
        }
    }
}
