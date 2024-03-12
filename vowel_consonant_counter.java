import java.util.Scanner;

public class vowel_consonant_counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive counting

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Count vowels and consonants
        for (char ch : inputString.toCharArray()) {
            if (isVowel(ch)) {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }

        // Output the results
        System.out.println("Original String: " + inputString);
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);

        // Close the scanner
        scanner.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
