/*Write a java program to find the sum of ‘N’ numbers.*/

import java.util.*;

public class EXJ_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("The sum of " + n + " numbers is: " + sum);
        scanner.close();
    }
}

