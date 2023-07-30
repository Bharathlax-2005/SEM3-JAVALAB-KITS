import java.util.Arrays;
import java.util.Scanner;

public class EXJ_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] originalArray = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        int[] ascendingArray = Arrays.copyOf(originalArray, size);
        int[] descendingArray = Arrays.copyOf(originalArray, size);

        Arrays.sort(ascendingArray);
        Arrays.sort(descendingArray);
        reverseArray(descendingArray);

        // Display the arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Ascending Array: " + Arrays.toString(ascendingArray));
        System.out.println("Descending Array: " + Arrays.toString(descendingArray));

        scanner.close();
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
