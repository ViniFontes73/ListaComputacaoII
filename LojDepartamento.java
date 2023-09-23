package com.mycompany.lojadepartamento;
import java.util.Scanner;
public class LojaDepartamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Informe o saldo no início do mês: ");
        double saldoInicial = scanner.nextDouble();
        System.out.print("Informe o total de gastos do cliente no mês: ");
        double despesas = scanner.nextDouble();
        System.out.print("Informe o total de créditos aplicados no mês: ");
        double creditos = scanner.nextDouble();
        System.out.print("Informe o limite de crédito autorizado: ");
        double limiteCredito = scanner.nextDouble();
        // --------- novo saldo ----------
        double novoSaldo = saldoInicial + despesas - creditos;
        // ----------se o novo saldo excede o limite de crédito
        if (novoSaldo > limiteCredito) {
            System.out.println("Limite de crédito excedido para a conta " + numeroConta);
        } else {
            System.out.println("Novo saldo para a conta " + numeroConta + " é: " + novoSaldo);
        }
        scanner.close();
    }
}
