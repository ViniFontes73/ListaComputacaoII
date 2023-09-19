// ----------------------  Junto da classe FaturaTeste -------------------------
package com.mycompany.faturateste;
/**
 *
 * @author Vinicius
 */
public class Fatura {
private String numero;
private String descricao;
private int quantidadeCompradaItem;
private double precoItem;
// ------ construtor ------
    public Fatura(String numero, String descricao, int quantidadeComprada, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeCompradaItem = quantidadeComprada; // Configurar diretamente
        this.precoItem = precoPorItem; // Configurar diretamente
        validarValores();
    }
    // get e set para o número
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    } 
    // ----- get e set descricao----
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    // --- get e set para Quantidade de compra ----
    public int getQuantidadeCompradaItem (){    //usar int ao inves de void pois nao é campo vazio
        return quantidadeCompradaItem;
    }
    public void setQuantidadeCompradaItem (int quantidadeCompradaItem){
    this.quantidadeCompradaItem = quantidadeCompradaItem;
    validarValores();
    }
    public double getPrecoItem (){
    return precoItem;
    }
    public void setPrecoItem (double precoItem){
    this.precoItem = precoItem;
    validarValores(); // chama a validação
   
    }
    private void validarValores() {
       if (quantidadeCompradaItem < 0) {
            quantidadeCompradaItem = 0;
       }
       if (precoItem < 0.0) {
           precoItem = 0.0;
       }
    }
// ------------fazer a fatura total ----------------
    public double getTotalFatura(){
    return quantidadeCompradaItem * precoItem;
    }
}
