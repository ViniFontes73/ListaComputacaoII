package com.mycompany.algoritmoeuclides;
import java.util.Scanner;
public class AlgoritmoEuclides {
// é necessário adaptar o algoritmo ou usar um método diferente, como a decomposição em fatores primos. Para números racionais
    public static void main(String[] args) {
        // enquanto o número for irracional o sistema não aceita.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque os dois números que deseja verificar o Multiplo Divisor Comum!");
        System.out.println("Insira o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = scanner.nextInt();
        CalculaMDC calculadora = new CalculaMDC(a,b);
        // Defina os valores de a e b e calcule o MDC
        //calculadora.setA(-30);
        //calculadora.setB(6);
        int mdc = calculadora.calcularMDC();
        System.out.println("MDC de " + calculadora.getA() + " e " + calculadora.getB() + " é igual à: " + mdc);
    }
}
