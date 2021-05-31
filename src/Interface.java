
//Vi opretter her en interface, uden for main metoden.
interface WaterBottleInterface{

    String color = "blue";

    void fillup();
}

//Her implementerer vi interfacet længere oppe, altså skal alle dens metoder og attributter bruges.
public class Interface implements WaterBottleInterface  {

    public static void main(String[] args){
        System.out.println(color);

        //Instans af klassen Interface.
        Interface in = new Interface();
        in.fillup();

    }

    @Override
    public void fillup() {
        System.out.println("It is filled");
    }

}
