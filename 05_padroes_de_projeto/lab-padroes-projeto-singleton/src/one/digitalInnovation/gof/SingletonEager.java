package one.digitalInnovation.gof;

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

    public SingletonEager getInstancia(){
        return instancia;
    }
}
