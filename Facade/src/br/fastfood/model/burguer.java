package br.fastfood.model;

public class burguer implements ItemCombo {
    private final String nome;
    private final double preco;

    public burguer(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }

    // Factory Methods (opcional, pra combos prontos)
    public static burger bigCheddar() {
        return new burger("Big Cheddar", 15.0);
    }

    public static burger chickenCrispy() {
        return new burger("Chicken Crispy", 17.5);
    }
}
