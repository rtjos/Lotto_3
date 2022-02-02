import java.util.*;
import java.io.IOException;

public class Lotto
{
    Scanner sc = new Scanner(System.in);
    int geld = 1000;
    
    public Lotto()
    {
        eroeffnung();
    }
    
    public static void main(String[] args)
    {
        new Lotto();   
    }
    
    public String eroeffnung()
    {
        printSlow("Herzlich Willkommen in der Lotterie Ewert!!! Wie heißen sie?");
        String name = sc.next();
        printSlow("Hallo " + name + ", du hast ein Startbuget von " + String.valueOf(geld) + "$.");
        printSlow("Gleich geht es los...");
                return name;
        
    }
    
    public void printSlow(String text)
    {
        char[] textInBuchstaben = text.toCharArray();
        for(char buchstabe : textInBuchstaben )
        {
            System.out.print(buchstabe);
            try
            {
                Thread.sleep(50);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        System.out.println();
    }
}
