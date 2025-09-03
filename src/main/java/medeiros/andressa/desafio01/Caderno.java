package main.java.medeiros.andressa.desafio01;

public class Caderno {
    private String nome;
    private double preco;

    public Caderno() {
        this.nome = "Caderno";
        this.preco = 15.0;
    }

    public boolean alterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, Preço: R$%.2f", this.nome, this.preco);
    }
}
