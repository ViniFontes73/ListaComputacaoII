package com.mycompany.person;
/**
 *
 * @author Vinicius
 */
public class Person {
    private String nome;   //atributo    + modificador de acesso, private é acessivel apenas dentro da classe
    private int idade;     // atributo 
    public Person(String nome, int idade) {
        this.nome = nome;          //construtor
        this.idade = idade;         //construtor
    }
    public String getNome() {
        return nome;            
    }                               //Os métodos set e get são métodos de instância de uma classe em Java
    public int getIdade() {
        return idade;
    }
    public static void main(String[] args) {
        // Crie duas instâncias da classe Person usando o construtor
        // Pode ser usado oScannner para pegar dados do usuario 
        Person pessoa1 = new Person("Alice", 30);
        Person pessoa2 = new Person("Bob", 25);

        // Imprima o nome e a idade de cada instância
        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
    }
}
