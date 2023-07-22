import java.util.*;

public class array_demo {
    public static void main(String[] args) {

        int a[] = { 6, 7, 5, 2, 0, 0, 6, 4, 3, 6, 3, 6, 1, 9, 9, 8 };
        int i, j;
        for (i = 0; i <= 9; i++) {
            int count = 0;
            for (j = 0; j <= 16 - 1; j++) {
                if (i == a[j]) {
                    count++;
                }
            }
            System.out.println(i + " is " + count + " times");
        }
    }
}
