package java;
import java.io.Console;
import java.util.Calendar;

public class example {
    public static void main(String[] args) {
        Console console = System.console();

        String name;
        name = console.readLine("Vad heter du? ");
        
        int age;
        age = Integer.valueOf(console.readLine("Hur gammal är du? "));
    
        Calendar calendar; 
        calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        int birthYear; 
        birthYear = currentYear - age;
        System.out.println("Okej " + name + ". Du föddes alltså år " + birthYear + ".");
    
        String hasChildren;
        hasChildren = console.readLine("Har du några barn? ");
    
        if (hasChildren.equals("ja")) {
            int childrenAmount;
            childrenAmount = Integer.valueOf(console.readLine("Hur många barn har du? "));
            System.out.println("Trevligt med " + childrenAmount + " barn. Själv har jag inga barn då jag är ett program.");
        } else {
            System.out.println("Inte jag heller, för att jag är ett program.");
        } 
    }
}