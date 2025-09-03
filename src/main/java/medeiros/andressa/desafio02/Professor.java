package main.java.medeiros.andressa.desafio02;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor() {
        super();
        this.disciplina = "Matemática";
    }

    @Override
    public String apresentar() {
        return super.apresentar() + ", professor de " + this.disciplina + ".";
    }
}
