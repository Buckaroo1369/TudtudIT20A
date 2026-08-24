package Prelim;


public class TwoDArray {
    
    public static void main(String args[]) {
        
        String friends[][] = {
                            {"Klaire" , "Pio" , "EG"} ,
                            {"Maureen" , "Jenny" , "Zustin"} ,
                            {"JV" , "Kian" , "Cedric" }
                              };
        
        for (int c = 0; c < friends.length; c++) {
            for (int v = 0; v < friends[c].length; v++) {
                System.out.print(friends[c][v] + ", ");
            }
            
            System.out.println();
        }
    }
    
}
