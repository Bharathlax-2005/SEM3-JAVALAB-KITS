/*Write a java program to read the age of a candidate and determine whether he
is eligible to cast his/her own vote.*/

import java.util.*;

public class EXJ_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (isEligibleToVote(age)) {
            System.out.println("You are eligible to cast your vote.");
        } else {
            System.out.println("You are not eligible to cast your vote.");
        }

        scanner.close();
    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
