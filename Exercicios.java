package AulasDIO;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        // 1 Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
        // "Olá, [Nome]. Você tem "x" anos."

        int anoBase = OffsetDateTime.now().getYear();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Informe seu ano de nascimento: ");
        int ano = leitura.nextInt();
        System.out.println("Olá, " + nome + ". Você tem " + (anoBase - ano) + " anos.");

        // 2 Escreva um código que receba o tamanho do um lado de um quadrado, calcule sua área e exiba na tela
        // fórmula: área = lado x lado

        System.out.println("Escreva o tamanho de um lado de um quadrado para descobrir sua área: ");
        double lado = leitura.nextDouble();
        System.out.println("Sua área é de " + (lado * lado));

        // 3 Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
        // fórmula: área = base x altura

        System.out.println("Escreva a base do retângulo: ");
        double b = leitura.nextDouble();
        System.out.println("Agora escreva sua altura: ");
        double h = leitura.nextDouble();
        System.out.println("Sua área é de " + (b * h));

        // 4 Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferênça de idade entre elas
        Scanner leitura2 = new Scanner(System.in);
        System.out.println("Digite o nome de uma pessoa: ");
        String nomeDaPessoa = leitura2.nextLine();
        System.out.println("Digite a idade dessa pessoa: ");
        int idadePessoa1 = leitura2.nextInt();
        System.out.println("Digite o nome de outra pessoa: ");
        String nomeOutraPessoa = leitura2.nextLine();
        System.out.println("Digite a idade dessa outra pessoa: ");
        int idadePessoa2 = leitura2.nextInt();
        System.out.println("A diferênça de idade entre " + nomeDaPessoa + " e " + nomeOutraPessoa + " é de " + (idadePessoa1 - idadePessoa2) + " anos.");
    }
}
