import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int maxPalindromeLength = 1;
        String maxPalindrome = word.substring(0, 1);

        for (int i = 0; i < word.length(); i++) {
            String currentPalindrome = getPalindrome(word, i, i);
            if (currentPalindrome.length() > maxPalindromeLength) {
                maxPalindromeLength = currentPalindrome.length();
                maxPalindrome = currentPalindrome;
            }

            currentPalindrome = getPalindrome(word, i, i + 1);
            if (currentPalindrome.length() > maxPalindromeLength) {
                maxPalindromeLength = currentPalindrome.length();
                maxPalindrome = currentPalindrome;
            }
        }

        System.out.println(maxPalindromeLength);
    }

    private static String getPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}