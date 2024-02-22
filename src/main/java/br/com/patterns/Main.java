package br.com.patterns;

import br.com.patterns.facade.Facade;
import br.com.patterns.singleton.SingletonEager;
import br.com.patterns.singleton.SingletonLazy;
import br.com.patterns.singleton.SingletonLazyHolder;
import br.com.patterns.strategy.*;

public class Main {
    public static void main(String[] args) {

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();

        SingletonLazyHolder singletonLazyHolder1 = SingletonLazyHolder.getInstance();
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstance();


        System.out.println("Singleton Lazy");
        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);

        System.out.println(" ");
        System.out.println("Singleton Eager");
        System.out.println(singletonEager1);
        System.out.println(singletonEager2);

        System.out.println(" ");
        System.out.println("Singleton Lazy Holder");
        System.out.println(singletonLazyHolder1);
        System.out.println(singletonLazyHolder2);

        System.out.println(" ");
        System.out.println("Strategy");
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
        robo.mover();

        System.out.println(" ");
        System.out.println("Facade");

        Facade facade = new Facade();
        facade.migrarCliente("Paulo", "13032395");
        facade.migrarCliente("Agatha", "13032399");



    }
}