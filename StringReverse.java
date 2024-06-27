//Reverse a string without altering the position of any special characters present in the string.

import java.util.*;

public class StringReverse {
    public static void stringReverse() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input string you'd like reversed");
        String toReverse = scnr.nextLine();
        String reversed = "";
        for (int i = toReverse.length()-1; i >= 0; i --){
            reversed +=toReverse.charAt(i);
        } 
        System.out.println(reversed);
    }
}