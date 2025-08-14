package AulasDIO;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 4;
        int chute = 0;
        boolean resultado = true;

        while (resultado) {
            System.out.println("Qual é o resultado da soma 2 + 2?");
            chute = Integer.parseInt(leitura.nextLine());

            if (chute == numero) {
                System.out.println("Parabéns, você acertou!");
                resultado = false;
            } else {
                System.out.println("Você errou! Tente novamente.");
            }
        }
    }
}
