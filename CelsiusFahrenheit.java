/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celsiusfahrenheit;
/**
 *
 * @author Vinicius
 */
import java.util.Scanner;
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        int menu;
        while (true) {
            System.out.println("1. Pra fazer a conversão de Celsius para Fahrenheit digite 1");
            System.out.println("2. Pra fazer a conversão de Fahrenheit para Celsius digite 2");
            System.out.println("0. Para sair digite 0");
            System.out.println("NÃO É NECESSARIO O USO DO SIMBOLO DE GRAU EM CELSIUS ");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Você escolheu a Opção 1.");
                    System.out.println("Por favor, insira o valor da temperatura em Celsius: ");
                    double celsius = scanner.nextDouble(); // valor principal
                    double Fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("Sua temperatura em Fahrenheit é: %.2f", Fahrenheit);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2.");
                    System.out.println("Por favor, insira o valor da temperatura em Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble(); // valor principal
                    double Celsius = (fahrenheit - 32) * 5/9;
                    System.out.printf("Sua temperatura em Celsius é: %.2fºC", Celsius);
                    System.out.println();
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
