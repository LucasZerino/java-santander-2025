package one.digitalInnovation.gof.singleton;

/**
 * Singleton "Apressado".
 *
 * @author LucasZerino
 * */


public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
