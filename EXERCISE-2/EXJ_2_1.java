import java.util.Scanner;

public class EXJ_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchNumber + " is present in the array.");
            System.out.println("It appears " + count + " time(s) in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }

        scanner.close();
    }
}
