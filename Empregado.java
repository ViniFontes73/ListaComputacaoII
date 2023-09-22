package com.mycompany.empregadoteste;
public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    // --- construtor --- 
    public Empregado (String nome, String sobrenome, double salarioMensal){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.salarioMensal = salarioMensal;
    }
    // --- set e get ---
    public String getNome(){
    return nome;}
    public void setNome( String nome){
        this.nome = nome;
    }    //-----------------
    public String getSobrenome(){
    return sobrenome;}
    public void setSobrenome( String sobrenome){
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal(){
    return salarioMensal;}
    public void setSalarioMensal(double salarioMensal){
    this.salarioMensal = salarioMensal;}
// AUEMNTAR SALARIO DO USUARIO
public double salarioAnual(){
    return salarioMensal * 12;
}
public double NovoSalario(){
    return salarioMensal + (salarioMensal * .10);
}
public double NovoSalarioAnual(){
    return (salarioMensal + (salarioMensal * .10))*12;}
}
