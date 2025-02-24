package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

public class MultiTableRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Starting Range...");

        int st = s.nextInt();

        System.out.println("Enter the Ending Range...");

        int end = s.nextInt();
        for (int i = st; i <= end; i++) {
            System.out.println("Which table you want to print:");
            int num = s.nextInt();
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " X " + num + " = " + j * num);
            }
        }
    }
}
