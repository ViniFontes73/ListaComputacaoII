package com.mycompany.datateste;
public class Data {
    private int mes;
    private int dia;
    private int ano;
    public Data(int mes, int dia, int ano){
    this.mes = mes;
    this.dia = dia;
    this.ano = ano;
    }
    // --------- GET E SET ----------
    public int getDia(){
        return dia;
    }
    public void setDia( int dia){
        this.dia = dia;
    }
    public int getMes(){
    return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    } 
    public int getAno(){
        return ano;
    
    public void setAno(int ano){
        this.ano = ano;
    }
    // ------ para exibir as informações em dd/mm/aaaa   
    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
