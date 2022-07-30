import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

public class ajratish {
    public static void main(String[] args) {

        String[] arr={"Alisher","Ali","Abbos","Alyor","Bobur","Begoyim","Adash","Bekmurod","Bektemir"};


       for (String x:arr){
           if (x.startsWith("A")){
               System.out.println("Array A: "+x);
           }
       }
        System.out.println();
        for (String i:arr){
            if (i.startsWith("B")){
                System.out.println("Array B: "+i);
            }
        }













    }
}
