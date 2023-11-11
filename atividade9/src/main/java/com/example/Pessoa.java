package com.example;

public class Pessoa 
{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String dizerOla() {
        return "Olá, eu sou " + nome + "!";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gustavo Brian");
        System.out.println(pessoa.dizerOla());
    }
}
