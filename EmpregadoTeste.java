package com.mycompany.empregadoteste;
import java.util.Scanner;
public class EmpregadoTeste {
    public static void main(String[] args) {
        //criar scanner para pegar dados de usuarios
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();
        // criar objetos
        Empregado empregado = new Empregado(nome,sobrenome,salarioMensal);
        exibirEmpregado(empregado);
    }
    public static void exibirEmpregado( Empregado empregado){
        System.out.println("Nome: " + empregado.getNome() );
        System.out.println("Sobrenome: " + empregado.getSobrenome() );  // + é diferente de ,
        System.out.printf("Salário Mensal:R$%.2f%n", empregado.getSalarioMensal() ); //certo
        System.out.printf("Salário Anual:R$%.2f%n", empregado.salarioAnual() );     //certo
        System.out.printf("Novo Salário Mensal:R$%.2f%n", empregado.NovoSalario() ); //
        System.out.printf("Novo Salário Anual:R$%.2f%n", empregado.NovoSalarioAnual() );
    }
}
