/*Write a java program to find first 10 prime numbers from natural numbers.*/

public class EXJ_3{
    public static void main(String[] args) {
        int count = 0, num = 2;
        while (count < 10) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
