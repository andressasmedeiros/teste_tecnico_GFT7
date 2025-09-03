package main.java.medeiros.andressa.desafio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caderno produto = new Caderno();

        System.out.println(produto);

        boolean precoAlterado = produto.alterarPreco(20.0);

        if (precoAlterado) {
            System.out.println("Valor atualizado com sucesso");
        }

        System.out.println(produto);
    }
}
