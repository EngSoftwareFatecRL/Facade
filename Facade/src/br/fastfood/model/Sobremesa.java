package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
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

    // Factory Methods
    public static Sobremesa sorvete() {
        return new Sobremesa("Sorvete", 5.5);
    }

    public static Sobremesa tortaDeMaca() {
        return new Sobremesa("Torta de Maçã", 6.0);
    }
}