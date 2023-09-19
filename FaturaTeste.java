package com.mycompany.faturateste;
/**
 *
 * @author Vinicius
 */
public class FaturaTeste {
public static void main(String[] args) {
        // Criação de objetos 
        Fatura fatura1 = new Fatura("001", "Produto A", 120, 9.0);
        Fatura fatura2 = new Fatura("002", "Produto B", -2, -5.0); // Testando valores negativos
        // Exibindo informações das faturas
        exibirFatura(fatura1);                    //
        exibirFatura(fatura2);                    //----------------------
    }
    // Método para exibir informações da fatura
    public static void exibirFatura(Fatura fatura) {
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura.getQuantidadeCompradaItem());
        System.out.println("Preço por Item: " + fatura.getPrecoItem());
        System.out.println("Total da Fatura: " + fatura.getTotalFatura());
        System.out.println();
    }
}
