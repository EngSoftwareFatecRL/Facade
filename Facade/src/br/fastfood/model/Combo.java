package br.fastfood.model;

public class Combo {
    private final burger burger;
    private final Bebida bebida;
    private final Sobremesa sobremesa;

    public Combo(burger burger, Bebida bebida, Sobremesa sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public burger getBurger() {
        return burger;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }
}
