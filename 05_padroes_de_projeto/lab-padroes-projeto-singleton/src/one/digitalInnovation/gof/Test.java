package one.digitalInnovation.gof;

import one.digitalInnovation.gof.singleton.SingletonEager;
import one.digitalInnovation.gof.singleton.SingletonLazy;
import one.digitalInnovation.gof.singleton.SingletonLazyHolder;
import one.digitalInnovation.gof.strategy.*;

public class Test {

    public static void main(String[] args){

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Método lazy endereço de memória: " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Método lazy endereço de memória2: "+ lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Método eager endereço de memória: " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Método eager endereço de memória2: "+ eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println("Método eager endereço de memória: " + holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println("Método eager endereço de memória2: "+ holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
    }
}
