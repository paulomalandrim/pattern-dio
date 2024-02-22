package br.com.patterns.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Está se movendo defensivamente");
    }
}
