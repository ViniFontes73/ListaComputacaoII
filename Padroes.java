package com.mycompany.padroes;
public class Padroes {
    public static void main(String[] args) {   // metodo
        int linhas = 10; 

        // Padrão A
        System.out.println("Padrão a:");
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        // Padrão B
        System.out.println("\nPadrão b:");
        for (int i = linhas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        // Padrão C
        System.out.println("\nPadrão c:");
        for (int i = linhas; i >= 1; i--) {
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
         // Padrão D
        System.out.println("\nPadrão d:");
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
