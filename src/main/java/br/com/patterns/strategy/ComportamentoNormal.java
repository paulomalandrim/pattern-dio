package br.com.patterns.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Está se movendo normalmente");
    }
}
