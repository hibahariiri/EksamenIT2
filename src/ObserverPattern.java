import java.util.Observable;
import java.util.Observer;
import java.util.Random;

//Her laver vi en klasse som extender fra Observable.
class vejr extends Observable{

    private String vejr;
    Random r = new Random();

    public vejr(String vejr){
        this.vejr = vejr;
    }

    public double getvejr(){

        Random r = new Random();

        double Minpuls = 0;
        double Maxpuls = 50;
        double vejr = Minpuls + (Maxpuls - Minpuls) * r.nextDouble();

        return vejr;
    }

    public void setVejr(String vejr){

        this.vejr = vejr;
                setChanged();
                notifyObservers(); //Hvis der sker ændringer vil denne metode notificerer observer.

    }
}

class Vejreksempel implements Observer{

    @Override
    //Dette er den eneste metode observer interface har.
    public void update(Observable observable, Object arg) {
        vejr vejrUpdate = (vejr) observable;
        System.out.println("Weather Report Live. It's "+ vejrUpdate.getvejr());

    }

}

public class ObserverPattern {

    public void main(String[] args) {

        vejr observable = new vejr(null);
        Vejreksempel observer = new Vejreksempel();

        observable.addObserver(observer);
        observable.setVejr("Bright and sunny... Let's plays cricket!!");
        observable.setVejr("Raining heavily! Let's have hot Pakodas!!");

    }

}
