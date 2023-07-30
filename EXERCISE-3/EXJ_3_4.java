import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EXJ_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> customerNames = new ArrayList<>();

        System.out.println("Enter customer names (enter 'done' to finish input):");
        String name;
        while (true) {
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            customerNames.add(name);
        }

        Collections.sort(customerNames);
        System.out.println("Customer names in ascending order:");
        for (String customerName : customerNames) {
            System.out.println(customerName);
        }
    }
}
