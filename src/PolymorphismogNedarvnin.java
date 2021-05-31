import java.lang.Override;


//vi laver en superklasse.
class bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}
//Dette er en underklasse/subklasse af superklassen bird, men med en anden funktion. Dog samme metode.
class Robin extends bird{
    public void sing(){
        System.out.println("tweedidelee");
    }

}

//Dette er en underklasse/subklasse af superklassen bird, men med en anden funktion. Dog samme metode.
class Pelican extends bird{
    public void sing(){
        System.out.println("KWAAH KWAHAH KWAHA");
    }

}

public class PolymorphismogNedarvnin {
    public static void main(String[] args){
        bird b = new bird();
        Robin R = new Robin();
        Pelican P = new Pelican();

        b.sing();
        R.sing();
        P.sing();
    }
}
