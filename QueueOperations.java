import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueueOperations {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("1 x: Enqueue element  into the end of the queue.");
        System.out.println("2: Dequeue the element at the front of the queue.");
        System.out.println("3: Print the element at the front of the queue.");
        Scanner scnr = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        int numQueries = Integer.valueOf(scnr.nextLine());
        for (int i = 0; i < numQueries; i ++){
            int command = Integer.valueOf(scnr.next());
            switch (command) {
                case 1: {
                    String newEntry = (scnr.next());
                    queue.add(newEntry);
                    // System.out.println("Added "+newEntry);
                    break;
                }
                case 2: {
                    // System.out.println("Removing front");
                    String q = queue.remove();
                    break;
                }
                case 3: {
                    // System.out.print("Front is ");
                    System.out.println(queue.peek());
                    break;
                }
            }
        }
    }
}


// Example Input
// STDIN   Function
// -----   --------
// 10      q = 10 (number of queries)
// 1 42    1st query, enqueue 42
// 2       dequeue front element
// 1 14    enqueue 42
// 3       print the front element
// 1 28    enqueue 28
// 3       print the front element
// 1 60    enqueue 60
// 1 78    enqueue 78
// 2       dequeue front element
// 2       dequeue front element
// Example Output
// 14
// 14