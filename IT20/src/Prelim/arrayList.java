package Prelim;
import java.util.ArrayList;


public class arrayList {
    
    public static void main(String[] args) {
        
        ArrayList<String> meowMeow = new ArrayList<>();
        
        meowMeow.add("John Vincent");
        meowMeow.add("Kian Jay");
        meowMeow.add("Christian Jude");
        meowMeow.add("Client Ryan");
        meowMeow.add(1, "Clister Vince");
        meowMeow.add("Japith Clint");
        meowMeow.addFirst("Marchilyn");
        
        for (int i = 0; i < meowMeow.size(); i++) {
            System.out.println(meowMeow.get(i));
        }
        
       
    }
    
}
