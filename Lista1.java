package com.mycompany.lista1;
import java.util.Scanner;
/**
 *
 * @author Vinicius
 */
public class Lista1 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Bem vindo! Inicie para saber se o número é um inteiro!");
        int escolha;
        while (true) {
            System.out.println("1. Para iniciar digite 1");
            System.out.println("0. Para sair digite 0");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:

                    System.out.println("Você escolheu a Opção 1.");
                    System.out.print("Por favor, insira um número para saber se é inteiro: ");
                    double numero = scanner.nextDouble(); // valor principal
                    if (numero == (int) numero) {
                    System.out.println("O número é um inteiro!!");
                    }
                    else    {
                    System.out.println("O número não é um inteiro!!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0); // Termina o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
