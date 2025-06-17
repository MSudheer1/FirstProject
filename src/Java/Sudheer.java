package Java;

import java.util.Scanner;

public class Sudheer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == 2 * array[j]) {
                    System.out.print("true");
                    return;
                }
            }
        }
        System.out.print("false");
    }
}
