import java.util.Scanner;

public class EXJ_3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the paragraph (press Enter twice to finish input):");
        StringBuilder paragraph = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            paragraph.append(line).append("\n");
        }

        System.out.print("Enter the character to replace vowels with: ");
        char replaceChar = scanner.next().charAt(0);

        String modifiedParagraph = replaceVowels(paragraph.toString(), replaceChar);
        System.out.println("\nOriginal Paragraph:\n" + paragraph.toString());
        System.out.println("\nModified Paragraph:\n" + modifiedParagraph);
    }

    public static String replaceVowels(String text, char replaceChar) {
        return text.replaceAll("[AEIOUaeiou]", String.valueOf(replaceChar));
    }
}

