package Lab5_Recursion;
import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        // TODO: Implement this using a loop
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        // TODO: Implement this recursively
        if (i == 0) {
            return;
        }
        task1B_recursive(i - 1);
        System.out.println(i);
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        // TODO: Implement this using a loop

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        // TODO: Implement this recursively
        if (n == 0) {
            return;
        }
        task1B_recursive(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----task1A----");
        task1A();
        System.out.println("----task1B----");
        task1B_recursive(10);
        System.out.println("----task1C----");
        int n= sc.nextInt();
        task1C(n);
        System.out.println("----task1D----");
        task1D_recursive(sc.nextInt(), sc.nextInt());

        // Driver code for testing Task 1 methods
        // Write on your own

        sc.close();
    }
}
