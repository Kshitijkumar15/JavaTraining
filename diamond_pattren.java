// Importing input output classes
import java.io.*;
 
// Main class
public class diamond_pattren {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Declaring and initializing variables
 
        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
        int number = 7;
 
        // Diamond starting with single star in first row
        int m = 1;
 
        // Columnar printing
        int n;
 
        // Outer loop 1
        // Prints the first half diamond
 
        // Condition holding true till
        // number of rows initialized
        while (m <= number) {
            n = 1;
 
            // Inner loop 1
            // Prints space until n++ <= number - m is false
            while (n++ <= number - m) {
 
                // Print whitespaces inbetween
                System.out.print(" ");
            }
 
            n = 1;
 
            // Inner loop 2
            // Prints star until n++ <= m * 2 - 1 is false
            while (n++ <= m * 2 - 1) {
 
                // Print star
                System.out.print("*");
            }
 
            // By now we are done for above pyramid printing
            // ending line after each row
            System.out.println();
 
            // Incrementing as we want pyramid generation
            m++;
        }
 
        // Now we are done with printing the upper half
        // diamond.
 
        // Note: Not to print the bottom row again in lower
        // half diamond printing Hence variable t be
        // initialized should one lesser than number
        m = number - 1;
 
        // Outer loop 2
        // Prints the second half diamond
        while (m > 0) {
            n = 1;
 
            // Inner loop 1
            // Prints spaces until n++ <= number - m is
            // false
            while (n++ <= number - m) {
 
                // Print whitespace in between
                System.out.print(" ");
            }
 
            n = 1;
 
            // Inner loop 2
            // Prints star until n++ <= m * 2 - 1 is false
            while (n++ <= m * 2 - 1) {
 
                // Print star
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
 
            // Decrementing as we want reverse pyramid
            // generation
            m--;
        }
    }
}