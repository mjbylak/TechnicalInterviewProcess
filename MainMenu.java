import java.util.*;

public class MainMenu {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            switch(choice) {
                case 1: 
                    StringReverse stringReverse = new StringReverse();
                    stringReverse.stringReverse();
                default:
                    println("Please select which feature you'd like to test");
                    println("1 for String Reverse \n0 to exit");
                    choice = Integer.parseInt((scnr.nextLine()));
            }
        }
        scnr.close();
    }

    public static void println(String output){
        System.out.println(output);
        return;
    }
}