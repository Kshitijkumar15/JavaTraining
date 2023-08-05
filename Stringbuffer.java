
import java.util.Scanner;

public class Stringbuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        StringBuilder sb2 = new StringBuilder("Hello 2");

        sb.append("World");
        sb2.append("World!");

        sb.insert(5, "Java");
        sb2.insert(7, "Swift");

        sb.reverse();
        sb2.reverse();

        System.out.println("StringBuffer: " + sb);
        System.out.println("StringBuilder: " + sb2);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.append("Java");
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + timeElapsed);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb2.append("Swift");
        }
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + timeElapsed);
    }
}