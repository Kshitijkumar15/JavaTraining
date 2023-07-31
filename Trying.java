

import java.util.*;

public class Trying {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r, c;
        System.out.println("Enter row inputs");
        r = s.nextInt();
        System.out.println("Enter col inputs");
        c = s.nextInt();
        int arr[][] = new int[3][3];
        int brr[][] = new int[3][3];
        System.out.println("Enter the inputs");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the inputs");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                brr[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the operators: +,-,*,/");
        char ch;
        ch = s.next().charAt(0);
        switch (ch) {
            case '+':
                add(arr, brr, r, c);
                break;
            case '-':
                sub(arr, brr, r, c);
                break;
            case '*':
                mul(arr, brr, r, c);
                break;
            case '/':
                divi(arr, brr, r, c);
                break;
        }
    }

    private static void divi(int[][] arr, int[][] brr, int r, int c) {
        Scanner s = new Scanner(System.in);
        int crr[][] = new int[3][3];
        System.out.println("Enter the values");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                crr[i][j] = arr[i][j] / brr[i][j];
                System.out.println("Division is " + crr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void mul(int[][] arr, int[][] brr, int r, int c) {
        Scanner s = new Scanner(System.in);
        int crr[][] = new int[3][3];
        System.out.println("Enter the values");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k < 3; k++) {
                    crr[i][j] = arr[i][k] * brr[k][j];
                    System.out.println("Multiplication is " + crr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    private static void sub(int[][] arr, int[][] brr, int r, int c) {
        Scanner s = new Scanner(System.in);
        int crr[][] = new int[3][3];
        System.out.println("Enter the values");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                crr[i][j] = arr[i][j] - brr[i][j];
                System.out.println("difference is " + crr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void add(int[][] arr, int[][] brr, int r, int c) {
        Scanner s = new Scanner(System.in);
        int crr[][] = new int[3][3];
        System.out.println("Enter choice 1:LLT, 2:RLT, 3:LUT, 4:RUT");
        int op;
        op = s.nextInt();

        switch (op) {

            case 1:
                System.out.println(" left Lower triangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <= i; j++) {
                        crr[i][j] = arr[i][j] + brr[i][j];
                        System.out.print(crr[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Right lower triangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = i; j <3-i; j++) {
                        crr[i][j] = arr[i][j] + brr[i][j];
                        System.out.print(crr[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Right lower triangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j >= i; j++) {
                        crr[i][j] = arr[i][j] + brr[i][j];
                        System.out.print(crr[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Right lower triangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j >= i; j++) {
                        crr[i][j] = arr[i][j] + brr[i][j];
                        System.out.print(crr[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
        }

    }
}
