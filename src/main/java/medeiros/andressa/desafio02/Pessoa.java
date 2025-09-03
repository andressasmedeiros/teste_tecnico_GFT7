package main.java.medeiros.andressa.desafio02;

public class Pessoa {
    protected String nome;

    public Pessoa() {
        this.nome = "Sofia";
    }

    public String apresentar() {
        return "Sou " + this.nome;
    }
}
