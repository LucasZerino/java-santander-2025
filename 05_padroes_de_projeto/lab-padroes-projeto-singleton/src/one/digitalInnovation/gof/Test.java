package one.digitalInnovation.gof;

public class Test {

    public static void main(String[] args){
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
    }
}
