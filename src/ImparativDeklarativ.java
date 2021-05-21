import java.util.List;

public class ImparativDeklarativ {

    //Imparativ metode
    public String returnStringIMP(String navn) {

        int længde = navn.length();
        String navn2 = null;

        if (længde > 0) {
            navn2 = navn;

        }

        return navn2;
    }

    //deklarativ metode
    public String returnStringDEC(String navn) {

        if (navn.length() > 0)
            return navn;

        return null;
    }


}
