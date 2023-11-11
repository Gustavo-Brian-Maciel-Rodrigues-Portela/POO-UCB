package com.example;

public class Pessoa 
{
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método para dizer "Olá"
    public String dizerOla() {
        return "Olá, eu sou " + nome + "!";
    }

    // Método getter para obter o nome
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Pessoa pessoa = new Pessoa("Gustavo Brian");
        System.out.println(pessoa.dizerOla());
    }
}
