package practice_1;

public class Problem6 {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters at the current positions do not match
            }
            left++;
            right--;
        }

        return true; // The string is a palindrome
    }

    public static void main(String[] args) {
        // Test the isPalindrome method
        String palindrome1 = "racecar";
        String palindrome2 = "A man a plan a canal Panama";
        String nonPalindrome = "hello";

        // Check if the strings are palindromes and display the results
        System.out.println(palindrome1 + " is a palindrome: " + isPalindrome(palindrome1));
        System.out.println(palindrome2 + " is a palindrome: " + isPalindrome(palindrome2));
        System.out.println(nonPalindrome + " is a palindrome: " + isPalindrome(nonPalindrome));
    }
}

