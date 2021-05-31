
public class Traade {

    //Main der hvor metoderne inden i kan kører.
    public static void main(String args[]){

        System.out.println("hello there...");

        Task taskRunner = new Task();
        //Her fortæller vi programmet at den skal starte metoden i Task.
        //Den venter dog ikke på at metoden bliver færdig før den går videre.
        taskRunner.start();

        Task taskRunner2 = new Task();
        taskRunner2.start();

    }

}
//En anden klasse, som vi laver tråden som skal køres i main.
class Task extends Thread{

    public void run(){
        for(int i=0; i < 100; i++){
            System.out.println("number: " + i);
        }


    }

}