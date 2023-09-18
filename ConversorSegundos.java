/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversorsegundos;

/**
 *
 * @author Vinicius
 */
import java.util.Scanner;
public class ConversorSegundos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedir o usuario o tempo em segundos
        System.out.println("Digite quantos segundos deseja converter: ");
        int seg = scanner.nextInt();
        // ----- calcular ----- tantos segundos possui tantas horas, minutos e segundos
        // segundo calculo seria usando double para dizer se tantos segundos possui 3,2 horas?
        int horas = seg /  3600 ;
        int minutos = (seg % 3600) / 60;
        int segundos = seg % 60;
        System.out.println("Tempo equivalente em horas, minutos e segundos:");
        System.out.printf("A sua entrada representa um total de: %d horas, %d minutos e %d segundos. ", horas, minutos, segundos);
        scanner.close();
    }
}
