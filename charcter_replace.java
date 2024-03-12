import java.util.Scanner;

public class charcter_replace {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Input index
        System.out.print("Enter the index to replace: ");
        int index = scanner.nextInt();

        // Validate index
        if (index < 0 || index >= originalString.length()) {
            System.out.println("Invalid index. Please enter a valid index.");
            return;
        }

        // Input replacement character
        System.out.print("Enter the character to replace with: ");
        char replacementChar = scanner.next().charAt(0);

        // Perform replacement
        char[] charArray = originalString.toCharArray();
        charArray[index] = replacementChar;
        String modifiedString = new String(charArray);

        // Output the original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        // Close the scanner
        scanner.close();
    }
}
