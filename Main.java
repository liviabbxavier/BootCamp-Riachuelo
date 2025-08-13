package AulasDIO;

import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Olá, seja bem-vindo!";

    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.println("Informe seu nome: ");
        String nome = meuScanner.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = meuScanner.nextInt();
        System.out.println("Olá " + nome + ", sua idade é: " + idade + " anos.");
    }
}
