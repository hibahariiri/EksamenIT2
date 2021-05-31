

public class Singleton {
    //Kræver en statisk metode, som laves her.
    private static Singleton INSTANCE = new Singleton();

    //Kræver at alle konstruktører er private.
    private Singleton(){}

    //Der kræves at lave en statisk metode der retunerer referencen til instancen.
    public static Singleton getINSTANCE(){
        return INSTANCE;
    }

}
