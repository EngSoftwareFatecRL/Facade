package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {
        if (codigo == 1) {
            combo = new Combo(
                    burguer.bigCheddar(),
                    Bebida.cocaCola(),
                    Sobremesa.sorvete()
            );
        } else if (codigo == 2) {
            combo = new Combo(
                    burguer.chickenCrispy(),
                    Bebida.sucoNatural(),
                    Sobremesa.tortaDeMaca()
            );
        } else {
            System.out.println("Código inválido! Criando Combo 1 como padrão.");
            combo = new Combo(
                    burguer.bigCheddar(),
                    Bebida.cocaCola(),
                    Sobremesa.sorvete()
            );
        }
    }

    public void exibirItens() {
        if (combo != null) {
            System.out.println("Itens do Combo:");
            System.out.println("- " + combo.getBurger());
            System.out.println("- " + combo.getBebida());
            System.out.println("- " + combo.getSobremesa());
        } else {
            System.out.println("Nenhum combo criado ainda!");
        }
    }

    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getBurger().getPreco() +
                    combo.getBebida().getPreco() +
                    combo.getSobremesa().getPreco();
        }
        return 0.0;
    }
}